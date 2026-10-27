package Ejercicio5;

public class Main {
        public static void main(String[] args) {
        Libro libro = new Libro("El principito");
        Lector lector = new Lector("Luis");

        Prestamo prestamo = new Prestamo(libro, lector);

        System.out.println("Primer préstamo: "
                + prestamo.registrarPrestamo());

        prestamo.mostrarEstado();

        System.out.println("Intento de repetir préstamo: "
                + prestamo.registrarPrestamo());

        System.out.println("Devolución: "
                + prestamo.registrarDevolucion());

        prestamo.mostrarEstado();
    }
}
