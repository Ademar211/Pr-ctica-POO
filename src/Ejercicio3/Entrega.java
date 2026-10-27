package Ejercicio3;

public abstract class Entrega {
    protected String destino;
    protected double distanciaKm;

    public Entrega(String destino, double distanciaKm) {
        this.destino = destino;
        this.distanciaKm = Math.max(0, distanciaKm);
    }

    public abstract double calcularCosto();

    public double calcularCosto(double recargo) {
        return calcularCosto() + Math.max(0, recargo);
    }
}
