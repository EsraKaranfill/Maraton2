package com.esra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_yarisma")
public class Yarisma extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String isim;
    Long sure;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "yarisma")
    @Builder.Default
    List<Yarismaci> yarismaciListesi=new ArrayList<>();
    public void addYarismaci(Yarismaci yarismaci){
        yarismaci.setYarisma(this);
        yarismaciListesi.add(yarismaci);
    }
    public Yarismaci enHizliBitiren() {
        return yarismaciListesi.stream()
                .min(Comparator.comparing(Yarismaci::getSure))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Yarisma{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", sure=" + sure +
                ", yarismaciListesi=" + yarismaciListesi +
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

    public Long getSure() {
        return sure;
    }

    public void setSure(Long sure) {
        this.sure = sure;
    }

    public List<Yarismaci> getYarismaciListesi() {
        return yarismaciListesi;
    }

    public void setYarismaciListesi(List<Yarismaci> yarismaciListesi) {
        this.yarismaciListesi = yarismaciListesi;
    }
}
