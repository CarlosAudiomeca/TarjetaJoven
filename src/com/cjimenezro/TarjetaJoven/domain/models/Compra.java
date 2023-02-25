package com.cjimenezro.TarjetaJoven.domain.models;

public class Compra {

    private String id;

    private String fecha;

    private Promocion datosPromo;

    private Usuario datosUser;

    //Funciones

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Promocion getDatosPromo() {
        return datosPromo;
    }

    public void setDatosPromo(Promocion datosPromo) {
        this.datosPromo = datosPromo;
    }

    public Usuario getDatosUser() {
        return datosUser;
    }

    public void setDatosUser(Usuario datosUser) {
        this.datosUser = datosUser;
    }
}
