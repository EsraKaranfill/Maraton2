package com.esra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_ipucu")
public class Ipucu extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ipucu;
    @ManyToOne()
    Unlu unlu;

    @Override
    public String toString() {
        return "Ipucu{" +
                "id=" + id +
                ", ipucu='" + ipucu + '\'' +
                ", unluId=" + unlu +
                "} " + super.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpucu() {
        return ipucu;
    }

    public void setIpucu(String ipucu) {
        this.ipucu = ipucu;
    }

    public Unlu getUnlu() {
        return unlu;
    }

    public void setUnlu(Unlu unlu) {
        this.unlu = unlu;
    }
}

