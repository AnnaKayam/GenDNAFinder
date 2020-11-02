package com.genfinfder.demo.controller;

import com.genfinfder.demo.service.GenFinderService;
import com.genfinfder.demo.service.IGenFinderService;
import com.genfinfder.demo.utilities.GenePatternUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/genes")
public class GenesController {
    private static final Logger log = LoggerFactory.getLogger(GenesController.class);

    @Autowired
    private final IGenFinderService genFinderService;

    public GenesController(GenFinderService genFinderService) {
        this.genFinderService = genFinderService;
    }

    @RequestMapping(value = "/find/{gene}", method = RequestMethod.GET)
    ResponseEntity findGen(@PathVariable("gene") String gene) {
        if (!GenePatternUtility.isPatternWithPrefixValid(gene)) {
            log.info("Gen " + gene + " is not of a valid form");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (genFinderService.isGenPresent(GenePatternUtility.getStringWithoutPrefix(gene))) {
            log.info("Gen " + gene + " found in DNA file");
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            log.info("Gen " + gene + " not found in DNA file");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
