package capitulo4;

public class Ejercicio16 {

    public static void main(String[] args) {

        int x = 1;
        int total = 0;

        while (x <= 10) {
            int y = x * x; // imprime el cuadrado de los primeros 10 números.
            System.out.println(y);
            //total = total + y;
            total += y; // Obtiene la suma de los cuadrados de los primeros 10 números.
            ++x;
        }

        System.out.println(total);


    }


}
