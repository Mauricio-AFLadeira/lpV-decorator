package org.example.decorator;

public class Mesa extends ComodoDecorator{
    public Mesa(Comodo comodo) {
        super(comodo);
    }
    public float getValorDaMobilia() { return 300.0f; }
}
