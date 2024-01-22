package com.esra.service;

import com.esra.entity.Unlu;
import com.esra.repository.UnluRepository;

import java.util.List;

public class UnluService {
    private UnluRepository repository;
    public void save(Unlu unlu){
        if (this.repository == null) {
            this.repository = new UnluRepository();
        }
        repository.save(unlu);
    }
    public List<Unlu> findAll(){
        return repository.findAll();
    }

}
