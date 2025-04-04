package udemy.pooclasesabstractas.form.validador;

public class LargoValidador extends Validador {

    protected String mensaje = "el campo %s debe tener mínimo %d caractéres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public boolean esValido(String valor) {

        this.mensaje = String.format(mensaje, this.min, this.max);
        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }
}
