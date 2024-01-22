package com.esra.repository;

import com.esra.entity.Yarisma;

public class YarismaRepository extends RepositoryManager<Yarisma,Long>{
    public YarismaRepository() {
        super(new Yarisma());
    }
}
