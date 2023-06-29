package com.example.proyectogrupal.dto.Mercancia;

import com.example.proyectogrupal.Entidades.Bodega;

public class MercanciaRequestDTO extends MercanciaDTO {

    private String nombre;

    private String descripcion;

    private String fechaentrada;

    private String motivoDevolucion;

    private String volumenOcupado;

    private Bodega bodega;

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

    public String getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
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
