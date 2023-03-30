package org.example.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComodoTest {
    @Test
    void deveRetornarValorDoComodo() {
        Comodo comodo = new Quarto(10000.0f);

        assertEquals(10000.0f, comodo.getValorDaPlanta());
    }

    @Test
    void deveRetornarValorDoComodoComTelevisao() {
        Comodo comodo = new Televisao(new Quarto(10000.0f));

        assertEquals(14000.0f, comodo.getValorDaPlanta());
    }

    @Test
    void deveRetornarValorDoComodoComMesa() {
        Comodo comodo = new Mesa(new Quarto(10000.0f));

        assertEquals(10300.0f, comodo.getValorDaPlanta());
    }

    @Test
    void deveRetornarValorDoComodoComCama() {
        Comodo comodo = new Cama(new Quarto(10000.0f));

        assertEquals(11000.0f, comodo.getValorDaPlanta());
    }

    @Test
    void deveRetornarValorDoComodoComTelevisaoMaisMesa() {
        Comodo comodo = new Televisao(new Mesa(new Quarto(10000.0f)));

        assertEquals(14300.0f, comodo.getValorDaPlanta());
    }

    @Test
    void deveRetornarValorDoComodoComTelevisaoMaisCama() {
        Comodo comodo = new Televisao(new Cama(new Quarto(10000.0f)));

        assertEquals(15000.0f, comodo.getValorDaPlanta());
    }

    @Test
    void deveRetornarValorDoComodoComMesaMaisCama() {
        Comodo comodo = new Mesa(new Cama(new Quarto(10000.0f)));

        assertEquals(11300.0f, comodo.getValorDaPlanta());
    }

    @Test
    void deveRetornarValorDoComodoComTelevisaoMaisMesaMaisCama() {
        Comodo comodo = new Televisao(new Mesa(new Cama(new Quarto(10000.0f))));

        assertEquals(15300.0f, comodo.getValorDaPlanta());
    }

}