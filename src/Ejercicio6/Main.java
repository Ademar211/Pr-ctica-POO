package Ejercicio6;

public class Main {
        public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPorHora("Marta", 1, 40, 20),
            new EmpleadoFijo("Pedro", 2, 3200)
        };

        for (Empleado empleado : empleados) {
            System.out.printf("%s (ID %d): Bs %.2f%n",
                    empleado.getNombre(),
                    empleado.getIdentificador(),
                    empleado.calcularPago());
        }
    }
}
