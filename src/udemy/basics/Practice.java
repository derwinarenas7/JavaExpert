package udemy.basics;

import javax.swing.*;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        /*byte numeroByte = 127;
        System.out.println(numeroByte);

        short numeroShort = 32767;
        System.out.println(numeroShort);

        int numeroInt = 32768;
        System.out.println(numeroInt);
        System.out.println(Integer.BYTES); // bytes 1 byte = 8 bits
        System.out.println(Integer.SIZE); // bits

        long numeroLong = 4294967295L;
        System.out.println(numeroLong);

        var num = 18.8;
        System.out.println(num);

        float numeroFloat = 2.120e3F;
        System.out.println(numeroFloat);

        char caracter = '\u0040'; // secuencia de escape.
        *//**
         * char acepta un unico caracter.
         *//*
        System.out.println(caracter);
        System.out.println(Character.SIZE);
        System.out.println("Character.BYTES = " + Character.BYTES);*/

        /*try {
            String mensaje = JOptionPane.showInputDialog(null, "Ingrese un número: ");
            int numero = Integer.parseInt(mensaje);
            System.out.println("numero = " + numero);
            String message = "Numero: " + numero;
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero");
            main(args);
            *//**
             * main(args) -> Esta sentencia me permite generar un bucle para ejecutar la clase
             * main hasta que el usuario ingrese un número valido.
             *//*
            System.exit(0);

        }*/

        /**
         * Encontrar las ocurrencias de un caracter
         */

        String nombre = "trabalenguasaaaa";
        //System.out.println("nombre.length() = " + nombre.length());
        
        int resultado = 0;
        for (int i = 0; i < nombre.length(); i++) {
            resultado = nombre.indexOf("a");
            resultado++;
        }
        //System.out.println("resultado = " + resultado);

        int i = 1;
        int j = 2;

        j = ++i;
        System.out.println("j = " + j);

        j = i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        boolean b1 = true || false && true;
        // && -> Siempre se evalúa primero.
        // la precedencia es así.
        System.out.println("b1 = " + b1);

        String[] username = new String[1];
        username[0] = "Der";
        System.out.println(Arrays.toString(username));

        String[] password = new String[]{"Ana"};
        System.out.println(Arrays.toString(password));













    }// main




}
