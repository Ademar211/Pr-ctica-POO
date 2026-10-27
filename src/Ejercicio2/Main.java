package Ejercicio2;

public class Main {
        public static void main(String[] args) {
        Producto cafe = new Producto("Café", 8);
        Producto sandwich = new Producto("Sándwich", 15);
        Producto jugo = new Producto("Jugo", 7);

        Pedido pedido = new Pedido();

        pedido.agregarProducto(cafe);
        pedido.agregarProducto(sandwich);
        pedido.agregarProducto(jugo);

        System.out.println("PRODUCTOS DEL PEDIDO");
        pedido.mostrarLineas();

        System.out.printf("Subtotal: Bs %.2f%n",
                pedido.calcularSubtotal());

        System.out.printf("Total: Bs %.2f%n",
                pedido.calcularTotal());
        }
}
