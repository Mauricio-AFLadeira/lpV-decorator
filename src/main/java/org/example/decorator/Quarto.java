package org.example.decorator;

public class Quarto implements Comodo{
    private float valorDoComodo;

    public Quarto() {}
    public Quarto(float valorDoComodo) {
        this.valorDoComodo = valorDoComodo;
    }

    public float getValorDaPlanta() {
        return valorDoComodo;
    }
}
