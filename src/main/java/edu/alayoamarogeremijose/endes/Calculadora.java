package edu.alayoamarogeremijose.endes;

/**
 * Proporciona métodos para realizar operaciones matemáticas básicas.
 * Incluye validación para evitar divisiones por cero.
 */
public class Calculadora {

    public double sumar(double a, double b) { return a + b; }
    public double restar(double a, double b) { return a - b; }
    public double multiplicar(double a, double b) { return a * b; }

    /**
     * Divide dos números decimales.
     * @param a El dividendo.
     * @param b El divisor (debe ser distinto de cero).
     * @return El cociente de la operación.
     * @throws IllegalArgumentException si el parámetro b es cero.
     */
    public double dividir(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
        return a / b;
    }
}