package com.example.proyectogrupal.dto.Bodega;

import com.example.proyectogrupal.dto.Mercancia.MercanciaDTO;

public class MercanciaRequestDTO extends MercanciaDTO{
    private Long id;
    private Double espacioTotal;
    private Double espacioParcial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getEspacioTotal() {
        return espacioTotal;
    }

    public void setEspacioTotal(Double espacioTotal) {
        this.espacioTotal = espacioTotal;
    }

    public Double getEspacioParcial() {
        return espacioParcial;
    }

    public void setEspacioParcial(Double espacioParcial) {
        this.espacioParcial = espacioParcial;
    }
}
