package udemy.poo_interfaces.modelo;

public interface Imprimible {

    String imprimir();
    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
