package udemy.arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {

        int[] numeros, pares, impares;
        numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba 10 números enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        // contadores para pares e impares
        int totalPares = 0;
        int totalImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[j++] = numeros[i];
            } else {
                impares[k++] = numeros[i];
            }
        }

        System.out.println("Pares: " + Arrays.toString(pares));
        System.out.println("Impares: " + Arrays.toString(impares));



    }



}
