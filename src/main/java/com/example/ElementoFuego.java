package com.example;

// Agua -> Fuego = 40
// Tierra -> Fuego = 20
// Fuego -> Fuego = 10

    // private double dañoATierra;
    // private double dañoAAgua;
    // private double dañoAFuego;
public class ElementoFuego extends Elemento{
    public String nombre;


    public ElementoFuego(String nombre){
        super(nombre);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double dañoA(Elemento elemento){
        return elemento.recibirDañoDeFuego();
    }

    public double recibirDañoDeTierra(){
        return 20;
    }

    public double recibirDañoDeAgua(){
        return 40;
    }

    public double recibirDañoDeFuego(){
        return 10;
    }
}