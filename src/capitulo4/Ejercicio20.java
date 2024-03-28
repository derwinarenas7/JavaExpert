package capitulo4;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double empleados = 0;
        double sueldoBruto = 0;

        while (empleados < 3) {

            System.out.print("Escriba el codigo del empleado: ");
            int empleado = sc.nextInt();

            System.out.print("Numero de horas trabajadas: ");
            double horasTrabajadas = sc.nextDouble();

            if (horasTrabajadas <= 40) {
                System.out.print("Tarifa si trabajó 40 horas o menos: ");
                double tarifaNormal = sc.nextDouble();
                sueldoBruto = tarifaNormal * horasTrabajadas;

            } else if (horasTrabajadas > 40) {
                System.out.print("Tarifa si trabajó más de 40 horas: ");
                double tarifaExtra = sc.nextDouble();
                sueldoBruto = (horasTrabajadas - 40) * tarifaExtra + 40;
            }

            System.out.printf("El sueldo bruto del empleado %s durante las %f es igual a: %.3f\n",
                    empleado, horasTrabajadas, sueldoBruto);
            empleados++;

        }






    }


}
