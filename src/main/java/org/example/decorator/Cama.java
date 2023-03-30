package org.example.decorator;

public class Cama extends ComodoDecorator{
    public Cama(Comodo comodo) {
        super(comodo);
    }
    public float getValorDaMobilia() { return 1000.0f; }
}
