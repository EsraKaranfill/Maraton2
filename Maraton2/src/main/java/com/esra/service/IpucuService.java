package com.esra.service;

import com.esra.entity.Ipucu;
import com.esra.entity.Unlu;
import com.esra.repository.IpucuRepository;
import com.esra.repository.UnluRepository;

import java.util.List;

public class IpucuService {
    private IpucuRepository repository;
    public void save(Ipucu ipucu){

        if (this.repository == null) {
            this.repository = new IpucuRepository();
        }
        repository.save(ipucu);
    }
    public List<Ipucu> findAll(){
        return repository.findAll();
    }

}
