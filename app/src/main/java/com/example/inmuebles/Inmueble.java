package com.example.inmuebles;

public class Inmueble {
    private String ubicacion;
    private double precio;
    private int foto;

    public Inmueble(String ubicacion, double precio, int foto) {
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.foto = foto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
