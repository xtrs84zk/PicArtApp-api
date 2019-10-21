package com.four.picartapp.model;

import javax.persistence.*;


@Entity
@Table(name = "Bajas")
public class Bajas {
    @Id
    @GeneratedValue
    int idBaja;
    @JoinColumn(name = "idProducto")
    @OneToOne
    Producto producto;
    @Column
    int cantidad;
    @Column
    String notas;
    @Column
    String fecha;

    public Bajas() {

    }

    public Bajas(int idBaja, Producto producto, int cantidad, String notas, String fecha) {
        this.idBaja = idBaja;
        this.producto = producto;
        this.cantidad = cantidad;
        this.notas = notas;
        this.fecha = fecha;
    }

    public int getIdBaja() {
        return idBaja;
    }

    public void setIdBaja(int idBaja) {
        this.idBaja = idBaja;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
