package capitulo4;

public class Ejercicio26 {

    public static void main(String[] args) {

        int fila = 5;

        while (fila >= 1) {
            int columna = 1;
            while (columna <= 5) {
                System.out.println(fila % 2 == 1 ? "<" :">");
                ++columna;
            }
            --fila;
            System.out.println();
        }



    }



}
