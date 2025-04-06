package capitulo3.ejercicios.ejercicio316;

import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {


    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public FrecuenciasCardiacas(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }


    /**
     * Método para calcular la edad de la persona
     */
    public int calculateAge(LocalDate actual) {
        return Period.between(dateOfBirth, actual).getYears();

    }


}
