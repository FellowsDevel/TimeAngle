package com.fellows.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClockTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    /**
     *
     * Problema:
     *
     * Dado um determinado horário (hora/minutos) seja capaz de calcular o
     * ângulo entre os 2 ponteiros do relógio.
     *
     * Requisitos do desafio: - O movimento dos ponteiros ocorrem de minuto em
     * minuto; - O resultado não deverá ser recalculado caso a mesma consulta
     * seja executada duas vezes; - Deve ser retornado sempre o menor ângulo;
     *
     *
     * Exemplo: $ curl request GET http://localhost:8080/rest/ clock/9
     * {"angle":90}
     */
    @Test
    public void concepcion() {
        Clock clock = new Clock();

        assertTrue(clock != null);

        clock.setHour(9);
        clock.setMinute(0);

        assertEquals("{\"angle\":90}", clock.toString());

    }

    @Test
    public void test2() {
        Clock clock = new Clock();

        assertTrue(clock != null);

        clock.setHour(3);
        clock.setMinute(44);

        assertEquals("{\"angle\":152}", clock.toString());

    }

}
