package com.example.proyectogrupal.dto.Mercancia;

public class MercanciaErrorDTO extends MercanciaDTO {

    private String mensaje;

    public MercanciaErrorDTO(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
