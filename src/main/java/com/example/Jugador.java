package com.example;
import java.util.*;

public class Jugador implements Selector{
    private String nombre;
    private List<Carta> mano;
    private Carta cartaActiva;

    public Jugador(String nombre){
        this.nombre=nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirCartas(Carta ... cartas){
        Collections.addAll(this.mano,cartas);
    }

    public Carta seleccionarCarta(){
        /*Scanner readTerminal = new Scanner(System.in);
        System.out.println("Seleccionar Carta");
        for (Carta carta: mano){
           System.out.println(carta.toString());
         }
        int cardIndex = readTerminal.nextInt();
        return this.mano.get(cardIndex);*/
        this.cartaActiva=this.mano.get(0);
        return this.cartaActiva;
    }

    public Carta getCartaActiva(){
        if (this.cartaActiva.estaMuerta()){
            return this.seleccionarCarta();
        }
        else{
            return this.cartaActiva;
        }
    }
}