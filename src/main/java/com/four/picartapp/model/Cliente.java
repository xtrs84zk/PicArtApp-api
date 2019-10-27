package com.four.picartapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Column
    @Id
    @GeneratedValue
    private int idCliente;
    @Column
    private String name;
    @Column
    private long telefono;
    @Column(unique = true, length = 40)
    private String correoElectronico;
    @Column(unique = true, length = 40)
    private long matricula;
    @Column(unique = true, length = 40)
    private String curp;
    @Column
    private String facebook;
    @Column
    private String nameAval;
    @Column
    private String telefonoAval;

    public Cliente(int idCliente, String name, long telefono, String correoElectronico, long matricula, String curp, String facebook, String nameAval, String telefonoAval) {
        this.idCliente = idCliente;
        this.name = name;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.matricula = matricula;
        this.curp = curp;
        this.facebook = facebook;
        this.nameAval = nameAval;
        this.telefonoAval = telefonoAval;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getNombreAval() {
        return nameAval;
    }

    public void setNombreAval(String nameAval) {
        this.nameAval = nameAval;
    }

    public String getTelefonoAval() {
        return telefonoAval;
    }

    public void setTelefonoAval(String telefonoAval) {
        this.telefonoAval = telefonoAval;
    }
}
