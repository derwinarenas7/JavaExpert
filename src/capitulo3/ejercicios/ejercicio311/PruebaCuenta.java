package capitulo3.ejercicios.ejercicio311;

import java.util.logging.Logger;

public class PruebaCuenta {


    public static void main(String[] args) {

        Logger logger = Logger.getLogger(String.valueOf(PruebaCuenta.class));

        Cuenta cuenta = new Cuenta("Derwin Arenas", 1256.365);


        cuenta.withdraw(2000);
        logger.info("balance = " + cuenta.getBalance());
    }
}
