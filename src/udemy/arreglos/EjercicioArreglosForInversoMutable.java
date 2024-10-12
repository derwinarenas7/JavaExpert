package udemy.arreglos;

import java.util.Arrays;

public class EjercicioArreglosForInversoMutable {

    public static void main(String[] args) {

        String[] productos = {
                "Puerta",
                "Celular Nokia",
                "Cámara",
                "Reloj",
                "Silla"
        };

        Arrays.sort(productos);

        int count = productos.length;

        System.out.println("==== for ====");
        for (int i = 0; i < count; i++) {
            System.out.println("producto en la posición " + i + " = " + productos[i]);
        }


    }


}
