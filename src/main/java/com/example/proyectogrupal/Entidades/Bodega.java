package com.example.proyectogrupal.Entidades;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "Bodega")
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "espacio-total", nullable = false)
    private String espacioTotal;

    @Column(name = "espacio_parcial", nullable = false)
    private Double espacioParcial;

    @OneToMany(mappedBy = "bodega")
    @JsonManagedReference
    private List<Mercancia> mercancia;
    @Transient
    private String mensjeError;

    public Bodega() {
    }

    public Bodega(Integer id, String espacioTotal, Double espacioParcial, List<Mercancia> mercancia, String mensjeError) {
        this.id = id;
        this.espacioTotal = espacioTotal;
        this.espacioParcial = espacioParcial;
        this.mercancia = mercancia;
        this.mensjeError = mensjeError;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspacioTotal() {
        return espacioTotal;
    }

    public void setEspacioTotal(String espacioTotal) {
        this.espacioTotal = espacioTotal;
    }

    public Double getEspacioParcial() {
        return espacioParcial;
    }

    public void setEspacioParcial(Double espacioParcial) {
        this.espacioParcial = espacioParcial;
    }

    public List<Mercancia> getMercancia() {
        return mercancia;
    }

    public void setMercancia(List<Mercancia> mercancia) {
        this.mercancia = mercancia;
    }

    public String getMensjeError() {
        return mensjeError;
    }

    public void setMensjeError(String mensjeError) {
        this.mensjeError = mensjeError;
    }
}

