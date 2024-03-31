package capitulo4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio29 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el tamaño del cuadrado que desea: ");
        int tamano = sc.nextInt();

        if (tamano >= 1 && tamano <= 20) {
            /**
             * Línea superior
             */
            for (int i = 0; i < tamano; i++) {
                System.out.print("*");
            }

            System.out.println();
            /**
             * Línea intermedia
             */

            for (int i = 0; i < tamano - 2; i++) {
                System.out.print("*"); //Asterisco lado izquierdo
                for (int j = 0; j < tamano - 2; j++) {
                    System.out.print(" "); // espacios intermedios
                }
                System.out.println("*"); // Asterisco lado derecho
            }


            /**
             * Línea inferior
             */

            for (int i = 0; i < tamano; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El dato ingresado no es correcto." +
                    "Debe estar entre 1 y 20");
        }

        main(args);





    } // main


}
