package udemy.arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 5 números enteros: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        boolean ascedente = false;
        boolean descendente = false;
        for (int i = 0; i < numeros.length - 1; i++) {

            if (numeros[i] > numeros[i + 1]) {
                descendente = true;
            }
            if (numeros[i] < numeros[i + 1]) {
                ascedente = true;
            }


        }

        if (ascedente == true && descendente == true) {
            System.out.println("Arreglo = desordenado");
        }

        if (ascedente == false && descendente == false) {
            System.out.println("Arreglo = todos son iguales");
        }

        if (ascedente == true && descendente == false) {
            System.out.println("Arreglo = ordenado en forma ascendente");
        }

        if (ascedente == false && descendente == true) {
            System.out.println("Arreglo = ordenado en forma descendente");
        }







    }



}
