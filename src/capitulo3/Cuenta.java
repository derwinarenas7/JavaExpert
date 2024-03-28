package capitulo3;

public class Cuenta {

    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public String getNombre() {
        return this.nombre;
    }

    /**
     * El saldo es una variable delicada. Por lo general, no le debe dar
     * acceso/posibilidad al usuario de acceder a dicha variable a través
     * de un método set (permitiría modificarlo).
     * En realidad, no es bueno permitirle el acceso a ningúna variable de instancia
     * a través del método set en una clase. Únicamente obtenerlos (método get).
     *
     */
    /*public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) {
            this.saldo = this.saldo + montoDeposito;
        }
    }

    /**
     * Modifique la clase Cuenta para proporcionar un método llamado
     * retirar, que retire dinero de un objeto Cuenta.
     * Asegúrese de que el monto a retirar no exceda el saldo de Cuenta.
     * Si lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un mensaje que indique
     * “El monto a retirar excede el saldo de la cuenta”.
     * Modifique la clase PruebaCuenta para probar el método retirar.
     */

    public void retirar(double montoRetiro) {
        if (montoRetiro > saldo) {
            System.out.println("El monto a retirar excede el saldo de la cuenta");
            System.out.printf("Su saldo actual es: %f", saldo);
        } else {
            saldo = saldo - montoRetiro;
            System.out.printf("Su retiro fue exitoso. Su nuevo saldo es: $ %.2f", saldo);
        }

    }


}
