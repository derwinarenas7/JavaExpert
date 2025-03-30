package udemy.collection.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");
        System.out.println(hs);

        boolean b = hs.add("3");

        System.out.println("permite elementos duplicados: " + b);
        System.out.println(hs);
    }
}
