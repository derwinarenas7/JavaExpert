package udemy.excepciones;

public class Calculadora {


    public double dividir(int numerador, int divisor) throws DivisionPorZeroException{
        if (divisor == 0) {
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return numerador / (double) divisor;
    }


}
