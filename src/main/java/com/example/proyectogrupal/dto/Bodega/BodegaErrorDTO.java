package com.example.proyectogrupal.dto.Bodega;

public class BodegaErrorDTO extends BodegaDTO{


    private String mensaje;

    public BodegaErrorDTO(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}