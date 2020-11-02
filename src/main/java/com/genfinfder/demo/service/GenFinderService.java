package com.genfinfder.demo.service;

import com.genfinfder.demo.repository.IDNARepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenFinderService implements IGenFinderService {
    public static final Logger log = LoggerFactory.getLogger(GenFinderService.class);

    @Autowired
    private IDNARepository repo;

    @Override
    public boolean isGenPresent(String gene) {
        if (gene.length() == 0) {
            log.debug("Empty string ");
            return false;
        }

        if (repo.isEmpty()) {
            log.debug("DNA file trie has no valid genes...");
            return false;
        }

        return repo.isGeneFound(gene);
    }
}
