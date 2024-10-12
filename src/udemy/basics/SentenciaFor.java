package udemy.basics;


import javax.swing.*;

public class SentenciaFor {
    public static void main(String[] args) {

        String[] apellidos = {"Arenas", "Díaz", "Andrade", "Cardona"};

        String buscar = JOptionPane.showInputDialog("Ingrese un apellido: ");
        System.out.println("Nombre " + "= " + buscar);

        int count = apellidos.length;
        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (apellidos[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null,
                    String.format("El apellido encontrado es: %s", buscar));
        } else {
            JOptionPane.showMessageDialog(null,
                    String.format("El apellido %s no existe", buscar));
        }






    }



}
