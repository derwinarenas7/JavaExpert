package capitulo4;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double sueldoSemanal = 200;
        final double porcentajeVentas = 0.09;
        double sueldoTotal;

        double precioArticulo1 = 239.99;
        double precioArticulo2 = 129.75;
        double precioArticulo3 = 99.95;
        double precioArticulo4 = 350.89;

        System.out.print("ingrese el id del vendedor: ");
        int contadorVendedor = sc.nextInt();

        while (contadorVendedor != -1) {

            System.out.println("Ingrese la cantidad de unidades vendidas de articulo 1 en esta semana: ");
            int cantidadArticulo1 = sc.nextInt();

            System.out.println("Ingrese la cantidad de unidades vendidas de articulo 2 en esta semana: ");
            int cantidadArticulo2 = sc.nextInt();

            System.out.println("Ingrese la cantidad de unidades vendidas de articulo 3 en esta semana: ");
            int cantidadArticulo3 = sc.nextInt();

            System.out.println("Ingrese la cantidad de unidades vendidas de articulo 4 en esta semana: ");
            int cantidadArticulo4 = sc.nextInt();


            sueldoTotal = sueldoSemanal + (
                    precioArticulo1 * cantidadArticulo1 +
                    precioArticulo2 * cantidadArticulo2 +
                    precioArticulo3 * cantidadArticulo3 +
                    precioArticulo4 * cantidadArticulo4) * porcentajeVentas;
            System.out.printf("El sueldo total del vendedor es: %.3f\n", sueldoTotal);

            System.out.println("Ingrese el siguiente vendedor o -1 para salir");
            contadorVendedor = sc.nextInt();
        }
        //System.out.printf("El sueldo total del vendedor es: %.3f", sueldoTotal);




    }



}
