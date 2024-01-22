package com.esra.repository;

import com.esra.entity.Unlu;

public class UnluRepository extends RepositoryManager<Unlu,Long> {
    public UnluRepository() {
        super(new Unlu());
    }

}
