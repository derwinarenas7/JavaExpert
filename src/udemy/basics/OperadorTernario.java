package udemy.basics;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        System.out.print("Ingresa tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        String name = "Derwin";

        String result = name.equals(nombre) ? "true" : "false";
        System.out.println(result);







    }
}
