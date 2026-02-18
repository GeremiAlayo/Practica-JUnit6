package edu.alayoamarogeremijose.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorPasswordTest {
    ValidadorPassword validador = new ValidadorPassword();

    @Test
    void testPasswordValida() {
        assertTrue(validador.esValida("Password123"));
    }

    @Test
    void testPasswordCorta() {
        assertFalse(validador.esValida("Pass1"));
    }

    @Test
    void testPasswordSinMayuscula() {
        assertFalse(validador.esValida("password123"));
    }

    @Test
    void testPasswordNula() {
        assertFalse(validador.esValida(null));
    }
}
