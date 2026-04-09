package com.example;

// Agua -> Agua = 10
// Tierra -> Agua = 20
// Fuego -> Agua = 40

    // private double dañoATierra;
    // private double dañoAAgua;
    // private double dañoAFuego;
public class ElementoAgua implements Elemento{
    public String nombre;


    public ElementoAgua(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double dañoA(Elemento elemento){
        return elemento.recibirDañoDeAgua();
    }

    public double recibirDañoDeTierra(){
        return 20;
    }

    public double recibirDañoDeAgua(){
        return 10;
    }

    public double recibirDañoDeFuego(){
        return 40;
    }
}