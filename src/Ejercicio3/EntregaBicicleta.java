package Ejercicio3;

public class EntregaBicicleta extends Entrega {
    public EntregaBicicleta(String destino, double distanciaKm) {
        super(destino, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return 3 + distanciaKm * 1.5;
    }
}
