package udemy.collection.hashmap;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

    public static void main(String[] args) {

        HashMap<String, String> persona = new HashMap<>();

        persona.put("nombre", "Derwin");
        persona.put("apellido", "Arenas");
        persona.put("correo", "derwin.arenas@gmail.com");
        persona.put("edad", "30");

        persona.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });



    }


}
