package capitulo3;

import java.util.Scanner;

public class PruebaCuenta {


    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",  montoDeposito);
        cuenta1.depositar(montoDeposito);


        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);


    } /*cierra main*/

    public static void mostrarCuenta(Cuenta cuentaAMostrar) {
        System.out.printf("Saldo de %s: $%.2f%n",
                cuentaAMostrar.getNombre(),
                cuentaAMostrar.getSaldo());
    }

}/*cierra clase*/

