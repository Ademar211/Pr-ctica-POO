package Ejercicio6;

public class EmpleadoFijo extends Empleado{
    private double sueldoMensual;

    public EmpleadoFijo(String nombre, int id, double sueldoMensual) {
        super(nombre, id);
        this.sueldoMensual = Math.max(0, sueldoMensual);
    }

    @Override
    public double calcularPago() {
        return sueldoMensual;
    }
}
