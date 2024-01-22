package com.esra.entity;

import com.esra.utility.enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.NoArgsConstructor;


@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_yarismaci")
public class Yarismaci extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String isim;
    @Enumerated
    Cinsiyet cinsiyet;
    @ManyToOne
    Unlu secilenUnlu;
    @ManyToOne
    Yarisma yarisma;
    Long sure;

    @Override
    public String toString() {
        return "Yarismaci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", secilenUnluId=" + secilenUnlu +
                ", yarismaId=" + yarisma +
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

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Unlu getSecilenUnluId() {
        return secilenUnlu;
    }

    public void setSecilenUnluId(Unlu secilenUnlu) {
        this.secilenUnlu = secilenUnlu;
    }

    public Yarisma getYarisma() {
        return yarisma;
    }

    public void setYarisma(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    public Long getSure() {
        return sure;
    }

    public void setSure(Long sure) {
        this.sure = sure;
    }
}
