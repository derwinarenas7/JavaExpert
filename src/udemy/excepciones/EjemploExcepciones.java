package udemy.excepciones;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println("division = " + division);
        } catch (NumberFormatException nfe) {
            System.out.println("se presenta un error cuando se ingresa un string");
            main(args);
        } catch (DivisionPorZeroException dz) {
            System.out.println("Se presenta un error: " + dz.getMessage());
            main(args);
        } finally {
            System.out.println("Se ejecuta siempre, con o sin excepción");
        }
        System.out.println("Continuamos con la ejecución del programa");
        
        
    }
}
