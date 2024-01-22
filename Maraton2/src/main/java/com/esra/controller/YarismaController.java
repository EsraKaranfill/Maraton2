package com.esra.controller;

import com.esra.entity.Unlu;
import com.esra.entity.Yarisma;
import com.esra.service.YarismaService;
import com.esra.service.YarismaciService;

import java.util.ArrayList;
import java.util.List;


public class YarismaController {
    private YarismaService service;
    public YarismaController() {
        this.service = new YarismaService();
    }
    private Yarisma yarisma;
    public void save(){
        if (this.yarisma == null) {
            this.yarisma = new Yarisma();
        }
        Yarisma yarisma1= Yarisma.builder()
                .isim("Ünlü Bilmece")
                .sure(20L)
                .yarismaciListesi(yarisma.getYarismaciListesi())
                .build();
        service.save(yarisma1);

    }
    public List<Yarisma> findAll()
    {
        return service.findAll();
    }

}
