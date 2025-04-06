package capitulo3.ejemplos;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Derwin Arenas", 2153);
        Cuenta cuenta2 = new Cuenta("Angie Díaz", 4523);

        // muestra el salario inicial de cada objeto
        System.out.println(" ======== DATOS INICIALES ======= ");
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        // objeto escane para la entrada de ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.println(" ====== CUENTA 1 ====== ");
        System.out.println("Escriba el monto a depositar para cuenta 1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de %s%n%n", montoDeposito, cuenta1.getName());
        cuenta1.deposit(montoDeposito);

        // muestra el saldo actualizado de cuenta1
        mostrarCuenta(cuenta1);

        System.out.println(" ====== CUENTA 2 ====== ");
        System.out.println("Escriba el monto a depositar para cuenta 2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de %s%n%n", montoDeposito, cuenta2.getName());
        cuenta2.deposit(montoDeposito);

        // muestra el saldo actualizado de cuenta2
        mostrarCuenta(cuenta2);

    }

    public static void mostrarCuenta(Cuenta cuentaAmostrar) {
        System.out.printf("Saldo de %s: $%.2f%n", cuentaAmostrar.getName(), cuentaAmostrar.getBalance());
    }


}
