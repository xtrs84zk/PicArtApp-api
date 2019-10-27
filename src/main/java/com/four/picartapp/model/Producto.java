package com.four.picartapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Column
    @Id
    @GeneratedValue
    private int idProducto;
    @Column(unique = true, length = 40)
    private String name;
    @Column
    private int costo_venta;
    @Column
    private int costo_renta;
    @Column
    private int cantidad;
    @Column(unique = true, length = 40)
    private String rutaDeLaImagen;
    @Column
    private String descripcion;
    @JoinColumn(name = "idCategoria")
    @OneToOne
    private Categoria categoria;


    public Producto(Categoria categoria, int idProducto, String name, int costo_venta, int costo_renta, int cantidad, String rutaDeLaImagen, String descripcion) {
        this.categoria = categoria;
        this.idProducto = idProducto;
        this.name = name;
        this.costo_venta = costo_venta;
        this.costo_renta = costo_renta;
        this.cantidad = cantidad;
        this.rutaDeLaImagen = rutaDeLaImagen;
        this.descripcion = descripcion;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCosto_venta() {
        return costo_venta;
    }

    public void setCosto_venta(int costo_venta) {
        this.costo_venta = costo_venta;
    }

    public int getCosto_renta() {
        return costo_renta;
    }

    public void setCosto_renta(int costo_renta) {
        this.costo_renta = costo_renta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getRutaDeLaImagen() {
        return rutaDeLaImagen;
    }

    public void setRutaDeLaImagen(String rutaDeLaImagen) {
        this.rutaDeLaImagen = rutaDeLaImagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
