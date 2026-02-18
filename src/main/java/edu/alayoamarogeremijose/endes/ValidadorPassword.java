package edu.alayoamarogeremijose.endes;

/**
 * Se encarga de verificar que las contraseñas cumplan con las políticas de seguridad.
 */
public class ValidadorPassword {

    /**
     * Evalúa si una contraseña es segura.
     * @param password El texto de la contraseña a validar.
     * @return true si tiene al menos 8 caracteres, una mayúscula y un número; false en caso contrario.
     */
    public boolean esValida(String password) {
        if (password == null) return false;
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*");
    }
}