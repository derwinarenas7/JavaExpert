package udemy.pooherencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private String notaIdiomas;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(String notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}
