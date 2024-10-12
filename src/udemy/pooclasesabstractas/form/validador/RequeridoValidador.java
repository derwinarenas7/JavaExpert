package udemy.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador {

    protected String mensaje = "El campo %s es requerido";

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
        return (valor != null && valor.length() > 0);
    }
}
