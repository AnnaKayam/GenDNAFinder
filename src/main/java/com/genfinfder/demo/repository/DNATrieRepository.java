package com.genfinfder.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DNATrieRepository implements IDNARepository {
    public static final Logger log = LoggerFactory.getLogger(DNATrieRepository.class);

    private boolean isLeaf;
    private final Map<Character, DNATrieRepository> suffixes;

    public DNATrieRepository() {
        suffixes = new HashMap<>();
    }

    @Override
    public boolean isEmpty() {
        return suffixes.isEmpty();
    }

    @Override
    public void insertGene(String key) {
        log.debug("Inserting :" + key + " gene to the trie");
        DNATrieRepository node = this;

        for (char c : key.toCharArray()) {
            node.suffixes.putIfAbsent(c, new DNATrieRepository());
            node = node.suffixes.get(c);
        }
        node.isLeaf = true;
    }

    @Override
    public boolean isGeneFound(String key) {
        log.info("Searching for :" + key + " gene in the trie ");
        DNATrieRepository node = this;

        for (char c : key.toCharArray()) {
            node = node.suffixes.get(c);
            if (node == null) {
                log.trace("Gene: " + key + " not found");
                return false;
            }
        }
        log.debug("Gene: " + key + (node.isLeaf ? " found" : " not found"));
        return node.isLeaf;
    }
}
