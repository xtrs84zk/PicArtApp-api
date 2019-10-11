package com.four.picartapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Integrante")
public class Integrante {
    @Column @Id
    private int idIntegrante;
    @Column
    private String nombre;
    @Column
    private String contrasena;
    @Column
    private String usuario;

    public Integrante(int idIntegrante, String nombre, String contrasena, String usuario) {
        this.idIntegrante = idIntegrante;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.usuario = usuario;
    }

    public int getIdIntegrante() {
        return idIntegrante;
    }

    public void setIdIntegrante(int idIntegrante) {
        this.idIntegrante = idIntegrante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
