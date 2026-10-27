package Ejercicio6;

public abstract class Empleado {
    protected String nombre;
    protected int identificador;

    public Empleado(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public abstract double calcularPago();

    public String getNombre() {
        return nombre;
    }

    public int getIdentificador() {
        return identificador;
    }
}
