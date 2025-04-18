package udemy.generics.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Camion<T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto) {

        if (this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay más espacio");
        }

    }


    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
