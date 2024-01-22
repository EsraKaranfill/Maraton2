package com.esra.service;

import com.esra.entity.Unlu;
import com.esra.entity.Yarisma;
import com.esra.entity.Yarismaci;
import com.esra.repository.UnluRepository;
import com.esra.repository.YarismaRepository;

import java.util.List;

public class YarismaService {
    private YarismaRepository repository;
    public void save(Yarisma yarisma){
        if (this.repository == null) {
            this.repository = new YarismaRepository();
        }
        repository.save(yarisma);
    }
    public List<Yarisma> findAll(){
        return repository.findAll();
    }

}
