package Ejercicio3;

public class EntregaAutomovil extends Entrega {
    
    public EntregaAutomovil(String destino, double distanciaKm) {
        super(destino, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return 8 + distanciaKm * 2.5;
    }
}
