package com.four.picartapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Puesto")
public class Puesto {
    @Column
    @Id
    @GeneratedValue
    private int idPuesto;
    @Column
    private String nombrePuesto;

    public Puesto() {
    }

    public Puesto(int idPuesto, String nombrePuesto) {
        this.idPuesto = idPuesto;
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
}
