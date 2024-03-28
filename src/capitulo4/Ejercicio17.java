package capitulo4;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el viaje inicial: ");
        int contadorViajes = scanner.nextInt();
        double totalKilometrosPorLitro = 0;

        while (contadorViajes != -1) {

            System.out.println("Ingrese los kilometros conducidos en el viaje");
            int kilometrosConducidos = scanner.nextInt();
            System.out.println("Ingrese los litros de combustible usados en el viaje");
            int litrosUsados = scanner.nextInt();

            double kilometrosPorLitro = (double) kilometrosConducidos / litrosUsados;
            System.out.printf("Los kilometros por litro son: %.2f\n", kilometrosPorLitro);

            totalKilometrosPorLitro += kilometrosPorLitro;

            System.out.print("ingrese el nuevo viaje: ");
            contadorViajes = scanner.nextInt();

        }

        System.out.printf("El total de kilometros por litro obtenidos en todos los viajes es: %.2f",
                totalKilometrosPorLitro);



    }



}
