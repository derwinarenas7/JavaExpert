package udemy.arreglos;

import java.util.Arrays;

public class EjercicioArreglosForInverso {

    public static void main(String[] args) {

        /*String[] productos = new String[5];*/
        String[] productos = {
                "Puerta",
                "Celular Nokia",
                "Cámara",
                "Reloj",
                "Silla"
        };
        System.out.println("productos[0] = " + productos[0]);
        /*productos[0] = "Puerta";
        productos[1] = "Celular Nokia";
        productos[2] = "Cámara";
        productos[3] = "Reloj";
        productos[4] = "Silla";*/

        Arrays.sort(productos);

        int count = productos.length;

        System.out.println("==== for ====");
        for (int i = 0; i < count; i++) {
            System.out.println("producto en la posición " + i + " = " + productos[i]);
        }

        System.out.println("==== for inverso ====");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println("productos en orden inverso = " + productos[i]);
        }


    }


}
