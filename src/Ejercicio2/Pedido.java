package Ejercicio2;

public class Pedido {
        private Producto[] productos = new Producto[3];
    private int cantidad = 0;

    public boolean agregarProducto(Producto producto) {
        if (producto == null || cantidad >= productos.length) {
            return false;
        }

        productos[cantidad] = producto;
        cantidad++;
        return true;
    }

    public double calcularSubtotal() {
        double subtotal = 0;

        for (int i = 0; i < cantidad; i++) {
            subtotal += productos[i].getPrecio();
        }

        return subtotal;
    }

    public void mostrarLineas() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". "
                    + productos[i]);
        }
    }

    public double calcularTotal() {
        return calcularSubtotal();
    }
}
