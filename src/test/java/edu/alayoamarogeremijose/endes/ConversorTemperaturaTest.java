package edu.alayoamarogeremijose.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {
    ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void testCelsiusAFahrenheit() {
        assertEquals(32, conversor.celsiusAFahrenheit(0), 0.01);
        assertEquals(212, conversor.celsiusAFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitACelsius() {
        assertEquals(0, conversor.fahrenheitACelsius(32), 0.01);
        assertEquals(100, conversor.fahrenheitACelsius(212), 0.01);
    }
}
