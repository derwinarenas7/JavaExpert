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

        //System.out.println(Arrays.toString(numeros));

        int mayor = Integer.MIN_VALUE;
        int mayor2 = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println(mayor);



    }




}
