package com.example.proyectogrupal.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="Mercancia")

public class Mercancia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;



    @Column(name="nombre",nullable = false, length =50 )
    private String nombre;

    @Column(name="descripcion",nullable = false, length =50 )
    private String descripcion;

    @Column(name="fechaEntrada",nullable = false, length =50 )
    private String fechaEntrada;

    @Column(name="MotivoDevolucion",nullable = false, length =50 )
    private String motivoDevolucion;

    @Column(name="VolumenOcupado",nullable = false, length =50 )
    private String volumenOcupado;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "bodega",nullable = false)
    @JsonBackReference
    private Bodega bodega;

    public Mercancia() {
    }

    public Mercancia(Integer id, String nombre, String descripcion, String fechaEntrada, String motivoDevolucion, String volumenOcupado, Bodega bodega) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEntrada = fechaEntrada;
        this.motivoDevolucion = motivoDevolucion;
        this.volumenOcupado = volumenOcupado;
        this.bodega = bodega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getMotivoDevolucion() {
        return motivoDevolucion;
    }

    public void setMotivoDevolucion(String motivoDevolucion) {
        this.motivoDevolucion = motivoDevolucion;
    }

    public String getVolumenOcupado() {
        return volumenOcupado;
    }

    public void setVolumenOcupado(String volumenOcupado) {
        this.volumenOcupado = volumenOcupado;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
}

