package com.genfinfder.demo.service;

import com.genfinfder.demo.repository.IDNARepository;
import com.genfinfder.demo.utilities.GenePatternUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DNAFileParser {

    @Autowired
    private final IDNARepository repo;

    public DNAFileParser(IDNARepository repo) {
        this.repo = repo;
    }

    public void processDNAFile(Scanner scan) {
        String prefix = GenePatternUtility.getPrefix();
        String fileStartsWithPrefix = scan.findWithinHorizon(prefix, prefix.length());
        scan.useDelimiter(prefix);
        // if file does not start with PREFIX - ignore all input up until first PREFIX detected.
        if (fileStartsWithPrefix == null) {
            if (scan.hasNext()) {
                scan.next();
            }
        }

        while (scan.hasNext()) {
            String gene = scan.next();
            if (GenePatternUtility.isPatternWithoutPrefixValid(gene))
                repo.insertGene(gene);
        }
    }
}
