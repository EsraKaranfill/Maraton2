package com.esra.service;

import com.esra.entity.Unlu;
import com.esra.entity.Yarismaci;
import com.esra.repository.UnluRepository;
import com.esra.repository.YarismaRepository;
import com.esra.repository.YarismaciRepository;

import java.util.List;

public class YarismaciService {
    private YarismaciRepository repository;
    public void save(Yarismaci yarismaci){
        if (this.repository == null) {
            this.repository = new YarismaciRepository();
        }
        repository.save(yarismaci);
    }
    public List<Yarismaci> findAll(){
        return repository.findAll();
    }

}
