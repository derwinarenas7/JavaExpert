package udemy.basics;

import java.util.Properties;

public class PropiedadesDelSistema {

    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String userhome = System.getProperty("user.home");
        System.out.println("userhome = " + userhome);

        Properties properties = System.getProperties();
        properties.list(System.out);

        
        
    }
    
    
    
}
