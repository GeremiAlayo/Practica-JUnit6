package edu.alayoamarogeremijose.endes;

/**
 * Utilidad para convertir valores térmicos entre escalas Celsius y Fahrenheit.
 */
public class ConversorTemperatura {

    /**
     * Convierte de grados Celsius a Fahrenheit.
     * @param celsius Valor en escala Celsius.
     * @return Equivalente en grados Fahrenheit.
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte de grados Fahrenheit a Celsius.
     * @param fahrenheit Valor en escala Fahrenheit.
     * @return Equivalente en grados Celsius.
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}