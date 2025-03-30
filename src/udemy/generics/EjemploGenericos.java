package udemy.generics;

import udemy.generics.genericsclass.Animal;
import udemy.generics.genericsclass.Automovil;
import udemy.generics.genericsclass.Camion;
import udemy.generics.genericsclass.Maquinaria;


public class EjemploGenericos {

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Caliche", "Percheron"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Mixtura", "caballo"));
        transporteCaballos.add(new Animal("Pirulo", "caballo"));
        transporteCaballos.add(new Animal("Cacheton", "caballo"));


        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(3);
        transporteMaquinaria.add(new Maquinaria("Buldoser"));
        transporteMaquinaria.add(new Maquinaria("Grua"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));

        imprimirCamion(transporteMaquinaria);

    }

    public static <T> void imprimirCamion(Camion<T> camion) {

        for (T a : camion) {
            if (a instanceof Animal) {
                System.out.println(((Animal)a).getNombre() +
                        " tipo: " + ((Animal)a).getTipo());
            } else if (a instanceof Automovil) {
                System.out.println(((Automovil) a).getMarca());
            } else if (a instanceof Maquinaria) {
                System.out.println(((Maquinaria) a).getTipo());
            }
        }

    }

}
