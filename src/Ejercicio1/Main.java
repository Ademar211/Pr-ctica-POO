package Ejercicio1;

public class Main {
        public static void main(String[] args) {
        CuentaDigital cuenta = new CuentaDigital("Ana", "CTA-001", 100);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Depósito de 50: " + cuenta.depositar(50));
        System.out.println("Saldo: " + cuenta.consultarSaldo());

        System.out.println("Retiro de 30: " + cuenta.retirar(30));
        System.out.println("Saldo: " + cuenta.consultarSaldo());

        System.out.println("Depósito de -5: " + cuenta.depositar(-5));
        System.out.println("Retiro de 500: " + cuenta.retirar(500));

        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}
