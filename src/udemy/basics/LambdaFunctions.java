package udemy.basics;

import java.util.Comparator;

public class LambdaFunctions {

    private double x;
    private double y;

    public void suma() {
        Comparator<?> tComparator = (x, y) -> {
            return 10 + 20;
        };
    }



}
