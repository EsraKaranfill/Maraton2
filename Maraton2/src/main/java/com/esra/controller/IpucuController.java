package com.esra.controller;

import com.esra.entity.Ipucu;
import com.esra.entity.Unlu;
import com.esra.repository.UnluRepository;
import com.esra.service.IpucuService;
import com.esra.service.UnluService;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class IpucuController {
    private final IpucuService service;
    private final UnluController unluController;
    UnluRepository unluRepository=new UnluRepository();
    Unlu unlu1=unluRepository.findById(1L).get();
    Unlu unlu2=unluRepository.findById(2L).get();
    Unlu unlu;
    public IpucuController(){
        this.unluController=new UnluController();
        this.service=new IpucuService();
    }

    public void save(){
        if (this.unlu == null) {
            this.unlu = new Unlu();
        }
        Ipucu ipucu1=Ipucu.builder()
                .ipucu("Mrs.Smith")
                .unlu(unlu1)
                .build();
        Ipucu ipucu2=Ipucu.builder()
                .ipucu("Mr.Smith")
                .unlu(unlu2)
                .build();
        service.save(ipucu1);
        service.save(ipucu2);
        unlu.addIpucu(ipucu1);
        unlu.addIpucu(ipucu2);
    }
    public List<Ipucu> findAll(){
        return service.findAll();
    }

}
