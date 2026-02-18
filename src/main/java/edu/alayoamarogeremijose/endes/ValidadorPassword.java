package edu.alayoamarogeremijose.endes;

public class ValidadorPassword {
    public boolean esValida(String password) {
        if (password == null) return false;
        // Al menos 8 caracteres, una mayúscula y un número
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*");
    }
}