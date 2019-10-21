package com.four.picartapp.model;

import javax.persistence.*;

@Entity
@Table(name = "ProductoAgregar")
public class ProductoAgregar {
    @Id
    @GeneratedValue
    int idProductoAgregar;
    @Column
    int cantidad;
    @JoinColumn(name = "idProducto")
    @OneToOne
    Producto producto;
    @Column
    String notas;
    @Column
    String fecha;

    public ProductoAgregar() {
    }

    public ProductoAgregar(int idProductoAgregar, int cantidad, Producto producto, String notas, String fecha) {
        this.idProductoAgregar = idProductoAgregar;
        this.cantidad = cantidad;
        this.producto = producto;
        this.notas = notas;
        this.fecha = fecha;
    }

    public int getIdProductoAgregar() {
        return idProductoAgregar;
    }

    public void setIdProductoAgregar(int idProductoAgregar) {
        this.idProductoAgregar = idProductoAgregar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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
