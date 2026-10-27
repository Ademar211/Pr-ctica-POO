package Ejercicio8;

public class ValidadorClave {

    public boolean esValida(String clave) {
        if (clave == null || clave.length() < 8) {
            return false;
        }

        boolean tieneLetra = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);

            if (Character.isLetter(c)) {
                tieneLetra = true;
            }

            if (Character.isDigit(c)) {
                tieneDigito = true;
            }

            if (Character.isWhitespace(c)) {
                return false;
            }
        }

        return tieneLetra && tieneDigito;
    }
} 