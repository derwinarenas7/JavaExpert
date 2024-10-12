package udemy.arreglos;

import java.util.Arrays;

public class EjemploArreglosOrdenPrincipioFinal {

    public static void main(String[] args) {

        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        //System.out.println(Arrays.toString(numeros));

        int[] a = new int[10];
        int aux = 0;

        for (int i = 0; i < numeros.length - i; i++) {
            /*System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);*/
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
        }
        System.out.println(Arrays.toString(a));











    }



}
