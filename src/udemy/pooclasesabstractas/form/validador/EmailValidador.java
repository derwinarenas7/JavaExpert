package udemy.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "el formato de email es inválido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
