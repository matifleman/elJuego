package com.example;

// Agua -> Agua = 10
// Tierra -> Agua = 20
// Fuego -> Agua = 40

    // private double dañoATierra;
    // private double dañoAAgua;
    // private double dañoAFuego;
public class ElementoTierra implements Elemento{
    public String nombre;


    public ElementoTierra(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double dañoA(Elemento elemento){
        return elemento.recibirDañoDeTierra();
    }

    public double recibirDañoDeTierra(){
        return 10;
    }

    public double recibirDañoDeAgua(){
        return 20;
    }

    public double recibirDañoDeFuego(){
        return 40;
    }
}