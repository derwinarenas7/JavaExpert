package capitulo4;

public class Ejercicio22 {

    public static void main(String[] args) {


        int[] factores = new int[]{1, 2, 3, 4, 5};

        System.out.print("N    10*N    100*N   1000*N\n");
        for (int fac : factores) {
            System.out.printf("\n%d     %d      %d      %d", fac, 10 * fac, 100 * fac, 1000 * fac);
        }



    }


}
