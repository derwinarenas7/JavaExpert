package udemy.arreglos;

import java.util.Arrays;

public class EjercicioArreglos {

    public static void main(String[] args) {

        String[] productos = new String[5];
        productos[0] = "Puerta";
        productos[1] = "Celular Nokia";
        productos[2] = "Cámara";
        productos[3] = "Reloj";
        productos[4] = "Silla";

        Arrays.sort(productos);

        System.out.println(Arrays.toString(productos));

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);


        int[] numeros = new int[4];
        numeros[0] = 1;
        numeros[1] = 0;
        numeros[2] = 3;
        numeros[3] = 4;

        int num1 = numeros[0];
        int num2 = numeros[1];
        int num3 = numeros[2];
        int num4 = numeros[3];

        for (int i = 0; i <= numeros.length - 1; i++) {
            System.out.println("numero en la posición " + i + " = " + numeros[i]);
        }



    }



}
