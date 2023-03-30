package org.example.decorator;

public class Televisao extends ComodoDecorator{
    public Televisao(Comodo comodo) {
        super(comodo);
    }
    public float getValorDaMobilia() { return 4000.0f; }
}
