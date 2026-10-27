package Ejercicio3;

public class Main {
        public static void main(String[] args) {
        Entrega[] entregas = {
            new EntregaBicicleta("Plaza", 4),
            new EntregaAutomovil("Universidad", 4)
        };

        for (Entrega entrega : entregas) {
            System.out.printf("Costo base: Bs %.2f%n",
                    entrega.calcularCosto());

            System.out.printf("Costo con recargo: Bs %.2f%n",
                    entrega.calcularCosto(2));
        }
    }
}
