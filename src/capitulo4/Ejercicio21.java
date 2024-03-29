package capitulo4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio21 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Escriba 10 números enteros: ");

        int contador = 0;
        while (contador < 10) {
            numeros[contador] = sc.nextInt();
            contador++;
        }

        System.out.println("===== arreglo de números intruducidos por el usuario ======");
        System.out.println(Arrays.toString(numeros));

        System.out.println("===== mayor numero en el arreglo =====");
        int count = numeros.length;
        int mayor = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("el número mayor es:  = " + mayor);

        /*for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("== for mejorado ==");

        System.out.println("el número mayor es: " + mayor);*/



    }


}
