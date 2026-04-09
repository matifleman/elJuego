package com.example;

public class Carta {
    private Elemento miElemento;
    private Double vida;

    public Carta(Elemento elemento){
        this.miElemento = elemento;
        this.vida = 100.0;
    }

    public void atacarA(Carta otraCarta){
        Elemento miElementoActual = this.miElemento;
        Elemento suElementoActual = otraCarta.getElemento();
        if (otraCarta.recibirDaño(miElementoActual.dañoA(suElementoActual))){
            System.out.println("Carta actual NO mato a otra carta");
        }
    }

    public boolean recibirDaño(double daño){
        if (this.vida - daño > 0){
            this.vida -= daño;
            return true;
        }
        this.vida = 0.0;
        return false;
    }

    public Double getVida(){
        return this.vida;
    }

    public Elemento getElemento(){
        return this.miElemento;
    }

    public boolean estaMuerta(){
        return this.vida>0.0;
    }
    @Override 
    public String toString(){
        return "Soy una carta de " + this.miElemento.getNombre() + " y mi vida es: " + this.vida;
    }
}
