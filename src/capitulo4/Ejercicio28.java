package capitulo4;

public class Ejercicio28 {

    public static void main(String[] args) {

        int x = 5;
        int y = 7;

        /**
         * Literal a
         * Salida: @@@@@ $$$$$ &&&&&
         */
        /*if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");*/

        /**
         * Literal b.
         * Salida: @@@@@ $$$$$
         */
        /*if (y == 8) {

            if (x == 5) {

                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
        }else{
            System.out.println("&&&&&");
        }*/

        /**
         * Literal C
         * Salida: @@@@@
         */
        /*if (y == 8) {

            if (x == 5)
                System.out.println("@@@@@");
            else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }*/

        /**
         * Literal D.
         * Salida: ##### $$$$$ &&&&&
         */
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {

            }
        }
        System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");



    }// main
}
