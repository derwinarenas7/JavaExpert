package udemy.arreglos;

import java.util.Arrays;

public class EjercicioArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "Puerta";
        productos[1] = "Celular Nokia";
        productos[2] = "Cámara";
        productos[3] = "Reloj";
        productos[4] = "Silla";

        Arrays.sort(productos);

        int count = productos.length;

        System.out.println("==== for ====");
        for (int i = 0; i < count; i++) {
            System.out.println("producto en la posición " + i + " = " + productos[i]);
        }

        System.out.println("==== foreach ====");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("==== usando while ====");
        int i = 0;
        while (i < count) {
            System.out.println("producto en la posición " + i + " = " + productos[i]);
            i++;
        }

        System.out.println("==== usando do while ====");
        int j = 0;
        do {
            System.out.println("producto en la posición de " + j + " = " + productos[j]);
            j++;
        } while (j < count);


        System.out.println("==== llenando un arreglo de números ====");

        int[] numeros = new int[10];

        int countNumeros = numeros.length;

        for (int k = 0; k < countNumeros; k++) {
            numeros[k] = k * 3;
        }
        System.out.println(Arrays.toString(numeros));

        for (int k = 0; k < countNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }





    }


}
