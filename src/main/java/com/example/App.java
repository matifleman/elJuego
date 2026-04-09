package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        Jugador jugador1 = new Jugador("Matias");
        Jugador jugador2 = new Jugador("Sebastian");

        Juego juego = new Juego(jugador1,jugador2);
        juego.repartirCartas();
        juego.jugar();
    }
}
