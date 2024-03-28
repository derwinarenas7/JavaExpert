package udemy.basics;

public class SentenciasBucleEtiquetas2 {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal trigotrigo";
        String palabra = "trigo";

        int countPalabra = palabra.length();
        int countFrase = frase.length() - countPalabra;

        int ocurrencias = 0;

        etiqueta1:
        for (int i = 0; i <= countFrase; i++) {
            int k = i;
            for (int j = 0; j < countPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue etiqueta1;
                }
            }
            ocurrencias++;
        }
        System.out.println("ocurrencias de " + palabra + " = " + ocurrencias);





    }



}
