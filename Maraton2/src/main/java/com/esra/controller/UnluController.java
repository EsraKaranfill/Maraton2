package com.esra.controller;

import com.esra.entity.Unlu;
import com.esra.service.UnluService;
import com.esra.utility.enums.Cinsiyet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class UnluController {
    private UnluService service;
    public UnluController() {
        this.service = new UnluService();
    }
    private Unlu unlu;
    public void save(){
        List<Unlu> unluler=new ArrayList<>();
        if (this.unlu == null) {
            this.unlu = new Unlu();
        }
        Unlu unlu1=Unlu.builder()
                .isim("Angelina Jolie")
                .cinsiyet(Cinsiyet.KADIN)
                .imageUrl(" ")
                .ipuclari(unlu.getIpuclari())
                .yarismaciList(unlu.getYarismaciList())
                .build();
        Unlu unlu2=Unlu.builder()
                .isim("Brad Pitt")
                .cinsiyet(Cinsiyet.ERKEK)
                .imageUrl(" ")
                .ipuclari(unlu.getIpuclari())
                .yarismaciList(unlu.getYarismaciList())
                .build();
        service.save(unlu1);
        service.save(unlu2);
        unluler.add(unlu1);
        unluler.add(unlu2);
    }
    public List<Unlu> findAll(){
        return service.findAll();
    }

}
