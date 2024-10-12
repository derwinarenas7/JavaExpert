package udemy.basics;

public class SentenciasBucleEtiquetas {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int count = frase.length();
        int ocurrencias = 0;
        char letra = 'g';
        for (int i = 0; i < count; i++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            ocurrencias++;
        }
        System.out.println("ocurrencias de " + letra + " = " + ocurrencias);






    }



}
