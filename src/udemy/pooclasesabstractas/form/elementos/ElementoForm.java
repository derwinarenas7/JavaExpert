package udemy.pooclasesabstractas.form.elementos;

import udemy.pooclasesabstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }


    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido() {
        for (Validador v : this.validadores) {
            if (!v.esValido(this.valor)) {
                this.errores.add(String.format(v.getMensaje(), nombre));
            }
        }

        return this.errores.isEmpty();
    }

    public abstract String dibujarHtml();

    public String getNombre() {
        return nombre;
    }
}
