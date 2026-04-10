package com.example;

    // private double dañoATierra;
    // private double dañoAAgua;
    // private double dañoAFuego;
public interface Elemento {

    public double dañoA(Elemento elemento);
    public double recibirDañoDeAgua();
    public double recibirDañoDeTierra();
    public double recibirDañoDeFuego();
    public String getNombre();

}