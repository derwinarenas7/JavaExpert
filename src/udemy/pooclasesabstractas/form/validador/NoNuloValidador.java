package udemy.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador {

    protected String mensaje = "El campo %s no puede ser nulo";

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
        return (valor != null);
    }

}
