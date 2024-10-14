package udemy.poo_interfaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();

    }

    public Curriculum addExperiencia(String expe) {
        experiencia.add(expe);
        return this;
    }

    @Override
    public String imprimir() {

        StringBuilder sb = new StringBuilder("Nombre: ")
                .append(persona)
                .append("\n")
                .append("Resumen: ")
                .append(this.contenido)
                .append("\n")
                .append("Profesión: ")
                .append(this.carrera)
                .append("\n")
                .append("Experiencia: ");

        for (String exp : this.experiencia) {
            sb.append("\n- ")
                    .append(exp);
        }
        return sb.toString();
    }
}
