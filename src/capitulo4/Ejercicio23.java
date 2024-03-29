package capitulo4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba 10 números enteros: ");

        int[] numeros = new int[10];
        int contador = 0;
        int count = numeros.length;
        while (contador < 10) {
            numeros[contador] = sc.nextInt();
            contador++;
        }

        int mayor1 = Integer.MIN_VALUE;
        int mayor2 = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (numeros[i] > mayor1) {
                mayor2 = mayor1;
                mayor1 = numeros[i];
            } else if (numeros[i] > mayor2 && numeros[i] != mayor1) {
                mayor2 = numeros[i];
            }
        }
        System.out.println("el primer número mayor es: " + mayor1);
        System.out.println("El segundo número mayor es: " + mayor2);



    }




}
