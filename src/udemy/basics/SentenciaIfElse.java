package udemy.basics;

import java.util.Scanner;

public class SentenciaIfElse {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribre tú promedio: ");
        double promedio = sc.nextDouble();

        if (promedio >= 6.5) {
            System.out.println("Excelente");
        } else if (promedio <= 5.0) {
            System.out.println("Perdiste");
        } else {
            System.out.println("Mejora");
        }








    }




}
