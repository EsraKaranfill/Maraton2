package com.esra;

import com.esra.controller.IpucuController;
import com.esra.controller.UnluController;
import com.esra.controller.YarismaController;
import com.esra.controller.YarismaciController;
import com.esra.entity.Yarisma;
import com.esra.entity.Yarismaci;
import com.esra.service.YarismaService;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {




    }
    static YarismaciController yarismaciController=new YarismaciController();
    static YarismaController yarismaController=new YarismaController();
    static IpucuController ipucuController=new IpucuController();
    static UnluController unluController=new UnluController();
    static Yarisma yarisma=new Yarisma();

    public static Yarismaci enHizliYarismaci(){
        Yarismaci enHizliYarismaci = yarisma.enHizliBitiren();

        if (enHizliYarismaci != null) {
            System.out.println("En hızlı yarışmacı: " + enHizliYarismaci.getIsim());
            System.out.println("Süre: " + enHizliYarismaci.getSure() + " saniye");
        } else {
            System.out.println("Yarışmacı listesi boş veya null.");
        }
        return  enHizliYarismaci;
    }

}