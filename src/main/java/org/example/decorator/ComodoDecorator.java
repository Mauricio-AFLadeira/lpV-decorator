package org.example.decorator;

public abstract class ComodoDecorator implements Comodo {
    private Comodo comodo;

    public ComodoDecorator (Comodo comodo) { this.comodo = comodo; }

    public Comodo getComodo() {
        return comodo;
    }

    public void setComodo(Comodo comodo) {
        this.comodo = comodo;
    }
    public abstract float getValorDaMobilia();

    public float getValorDaPlanta() {
        return this.comodo.getValorDaPlanta() + this.getValorDaMobilia();
    }

}
