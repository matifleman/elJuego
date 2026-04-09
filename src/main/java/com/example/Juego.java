package com.example;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private boolean juegoActivo;

    public Juego(Jugador jug1, Jugador jug2){
        this.jugador1 = jug1;
        this.jugador2 = jug2;
        this.juegoActivo = true;
    }
        

    public void jugar(){
        
        Carta carta1 = jugador1.seleccionarCarta();
        Carta carta2 = jugador2.seleccionarCarta();

        carta1.atacarA(carta2);
        System.out.println(carta2.getVida());

        // while(juegoActivo){
            
        // }
    }

    public void repartirCartas(){
        jugador1.recibirCartas(new Carta(new ElementoAgua("Agua")));
        jugador2.recibirCartas(new Carta(new ElementoTierra("Tierra")));
    }


}
        
