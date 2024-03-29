package capitulo4;

import java.util.Scanner;

public class Ejercicio24 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;

        while (contadorEstudiantes <= 10) {

            System.out.println("Escriba el resultado (1=aprobado, 2=reprobado): ");
            int resultado = entrada.nextInt();

            while (resultado != 1 && resultado != 2) {
                System.out.println("El resultado debe ser 1 o 2. Escriba el resultado (1=aprobado, 2=reprobado): ");
                main(args);
                aprobados++;
                reprobados++;
                contadorEstudiantes++;
            }

            if (resultado == 1) {
                aprobados++;
            } else {
                reprobados++;
            }
            contadorEstudiantes++;
        }
        System.out.printf("Aprobados: %d\nReprobados: %d\n", aprobados, reprobados);

        if (aprobados > 8) {
            System.out.println("Bono para el instructor");
        }


    }
}
