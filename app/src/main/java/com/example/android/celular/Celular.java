package com.example.android.celular;

/**
 * Created by android on 30/09/2017.
 */

public class Celular {
    String modelo;
    int marca;
    int sistema;
    int ram;
    int color;
    double precio;

    public Celular(String modelo, int marca, int sistema, int ram, int color,double precio){
        this.modelo=modelo;
        this.marca=marca;
        this.sistema=sistema;
        this.ram = ram;
        this.color = color;
        this.precio = precio;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getSistema() {
        return sistema;
    }

    public void setSistema(int sistema) {
        this.sistema = sistema;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardarCelular(this);
    }
}
