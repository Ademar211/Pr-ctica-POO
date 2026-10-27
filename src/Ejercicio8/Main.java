package Ejercicio8;

public class Main {
        public static void main(String[] args) {
        ValidadorClave validador = new ValidadorClave();

        String[] pruebas = {
            "abc123",
            "abcdefgh",
            "12345678",
            "abc12345",
            "abc 12345",
            ""
        };

        for (String prueba : pruebas) {
            System.out.println("\"" + prueba + "\" -> "
                    + validador.esValida(prueba));
        }
    }
}
