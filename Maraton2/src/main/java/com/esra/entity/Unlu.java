package com.esra.entity;

import com.esra.utility.enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;


@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_unlu")
public class Unlu extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String isim;
    String imageUrl;
    @Enumerated
    Cinsiyet cinsiyet;
    @OneToMany(cascade = CascadeType.ALL)
    @Builder.Default
    List<Ipucu> ipuclari=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    @Builder.Default
    List<Yarismaci> yarismaciList=new ArrayList<>();
    public void addYarismaci(Yarismaci yarismaci){
        Yarisma yarisma=new Yarisma();
        yarisma.addYarismaci(yarismaci);
    }
    public void addIpucu(Ipucu ipucu) {
        ipucu.setUnlu(this);
        ipuclari.add(ipucu);
    }

    @Override
    public String toString() {
        return "Unlu{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", ipuclari=" + ipuclari +
                ", yarismaciList=" + yarismaciList +
                "} " + super.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public List<Ipucu> getIpuclari() {
        return ipuclari;
    }

    public void setIpuclari(List<Ipucu> ipuclari) {
        this.ipuclari = ipuclari;
    }

    public List<Yarismaci> getYarismaciList() {
        return yarismaciList;
    }

    public void setYarismaciList(List<Yarismaci> yarismaciList) {
        this.yarismaciList = yarismaciList;
    }
}
