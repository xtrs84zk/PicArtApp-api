package com.four.picartapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Integrante")
public class Integrante {
    @Column
    @Id
    @GeneratedValue
    private int idIntegrante;
    @Column
    private String nombre;
    @Column
    private String contrasena;
    @Column(unique = true, length = 40)
    private String usuario;
    @OneToOne
    @JoinColumn
    private Puesto puesto;
    private boolean enabled;
    private boolean tokenExpired;

    public Integrante() {
    }

    public Integrante(int idIntegrante, String nombre, String contrasena, String usuario, Puesto puesto) {
        this.idIntegrante = idIntegrante;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.usuario = usuario;
        this.puesto = puesto;
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

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
    }
}
