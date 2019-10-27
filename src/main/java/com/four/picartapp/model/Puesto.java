package com.four.picartapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Puesto")
public class Puesto implements Serializable {
    @Column
    @Id
    @GeneratedValue
    private int idPuesto;
    @Column(unique = true, length = 40)
    private String namePuesto;

    public Puesto() {
    }

    public Puesto(int idPuesto, String namePuesto) {
        this.idPuesto = idPuesto;
        this.namePuesto = namePuesto;
    }

    public String getNombrePuesto() {
        return namePuesto;
    }

    public void setNombrePuesto(String namePuesto) {
        this.namePuesto = namePuesto;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
}
