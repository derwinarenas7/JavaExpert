package capitulo4;

import java.util.Scanner;

public class Ejercicio18 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el cliente: ");
        int contadorClientes = sc.nextInt();

        int nuevoSaldo = 0;

        while (contadorClientes != -1) {

            System.out.println("Ingrese el número de cuenta: ");
            int numeroCuenta = sc.nextInt();

            System.out.println("Ingrese el saldo inicial: ");
            int saldoInicial = sc.nextInt();

            System.out.println("Ingrese el total de todos los articulos cargados en el mes: ");
            int articulosCargadosMes = sc.nextInt();

            System.out.println("Ingrese el total de créditos aplicados a la cuenta del cliente en el mes: ");
            int creditosAplicadosMes = sc.nextInt();

            System.out.println("Ingrese el límite de crédito permitido para el cliente: ");
            int limiteCredito = sc.nextInt();

            nuevoSaldo = saldoInicial + articulosCargadosMes - creditosAplicadosMes;
            System.out.printf("Su nuevo saldo es: %.3s\n", nuevoSaldo);

            if (nuevoSaldo < 0) {
                System.out.println("Se excedio el límite de crédito");
            }


            System.out.print("Ingrese los datos del cliente: ");
            contadorClientes = sc.nextInt();

        }



    }




}
