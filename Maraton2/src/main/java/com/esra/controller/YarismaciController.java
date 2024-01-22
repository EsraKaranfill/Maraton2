package com.esra.controller;

import com.esra.entity.Unlu;
import com.esra.entity.Yarisma;
import com.esra.entity.Yarismaci;
import com.esra.repository.UnluRepository;
import com.esra.repository.YarismaRepository;
import com.esra.repository.YarismaciRepository;
import com.esra.service.IpucuService;
import com.esra.service.YarismaciService;
import com.esra.utility.enums.Cinsiyet;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Random;


public class YarismaciController {
    private YarismaciService service;
    private Unlu unlu;
    private Yarisma yarisma;
    UnluRepository unluRepository=new UnluRepository();
    YarismaRepository yarismaRepository=new YarismaRepository();
    Unlu unlu1=unluRepository.findById(1L).get();
    Unlu unlu2=unluRepository.findById(2L).get();
    Yarisma yarisma1=yarismaRepository.findById(1L).get();

    public YarismaciController() {
        this.service = new YarismaciService();
    }

        public void save(){
            if (this.unlu == null) {
                this.unlu = new Unlu();
            }
            if (this.yarisma == null) {
                this.yarisma = new Yarisma();
            }
        Random random=new Random();
        Yarismaci yarismaci1=Yarismaci.builder()
                .isim("Esra")
                .secilenUnlu(unlu1)
                .yarisma(yarisma1)
                .cinsiyet(Cinsiyet.KADIN)
                .sure(10L)
                .build();
        Yarismaci yarismaci2=Yarismaci.builder()
                .isim("Ebru")
                .secilenUnlu(unlu2)
                .yarisma(yarisma1)
                .cinsiyet(Cinsiyet.KADIN)
                .sure(15L)
                .build();
        service.save(yarismaci1);
        service.save(yarismaci2);
        unlu.addYarismaci(yarismaci1);
        unlu.addYarismaci(yarismaci2);
        yarisma.addYarismaci(yarismaci1);
        yarisma.addYarismaci(yarismaci2);


    }
    public List<Yarismaci> findAll(){
        return service.findAll();
    }

}
