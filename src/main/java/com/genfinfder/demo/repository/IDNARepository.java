package com.genfinfder.demo.repository;

public interface IDNARepository {
    boolean isEmpty();

    void insertGene(String key);

    boolean isGeneFound(String key);
}
