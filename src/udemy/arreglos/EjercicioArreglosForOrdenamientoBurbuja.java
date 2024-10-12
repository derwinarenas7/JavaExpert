package udemy.arreglos;

import java.util.Arrays;

public class EjercicioArreglosForOrdenamientoBurbuja {

    public static void main(String[] args) {

        String[] productos = {
                "Puerta",
                "Celular Nokia",
                "Cámara",
                "Reloj",
                "Silla"
        };
        int count = productos.length;

        /*for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            }
        }*/

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
            }
        }

        //Arrays.sort(productos);

        System.out.println("==== for ====");
        for (int i = 0; i < count; i++) {
            System.out.println("producto en la posición " + i + " = " + productos[i]);
        }


    }


}
