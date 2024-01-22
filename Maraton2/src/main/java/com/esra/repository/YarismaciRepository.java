package com.esra.repository;

import com.esra.entity.Yarismaci;

public class YarismaciRepository extends RepositoryManager<Yarismaci,Long> {
    public YarismaciRepository() {
        super(new Yarismaci());
    }


}
