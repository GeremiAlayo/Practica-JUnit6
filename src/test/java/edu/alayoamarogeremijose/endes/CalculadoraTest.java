package edu.alayoamarogeremijose.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    void testOperacionesBasicas() {
        assertEquals(10, calc.sumar(7, 3));
        assertEquals(4, calc.restar(10, 6));
        assertEquals(15, calc.multiplicar(3, 5));
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}