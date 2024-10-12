package udemy.pooherencia;

public class Profesor extends Persona {

    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() +
                "\nApellido: " + super.getApellido() +
                "\nasignatura: " + this.asignatura;
    }
}
