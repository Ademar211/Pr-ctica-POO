package Ejercicio2;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser positivo.");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - Bs "
                + String.format("%.2f", precio);
    }
}