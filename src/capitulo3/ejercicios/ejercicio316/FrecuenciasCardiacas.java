package capitulo3.ejercicios.ejercicio316;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

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

    public int calculateMaximunHeartRate() {

        int CONSTANTE = 220;
        int maximunHearRate = CONSTANTE - calculateAge(LocalDate.now());

        return maximunHearRate;

    }

    public String[] calculateExpectedHeartRate() {

        double minValue = 0.5;
        double value1 = 0.55;
        double value2 = 0.60;
        double value3 = 0.65;
        double value4 = 0.70;
        double value5 = 0.75;
        double value6 = 0.80;
        double maxValue = 0.85;

        double expectedHeartRate1 = calculateMaximunHeartRate() * minValue;
        double exp1 = calculateMaximunHeartRate() * value1;
        double exp2 = calculateMaximunHeartRate() * value2;
        double exp3 = calculateMaximunHeartRate() * value3;
        double exp4 = calculateMaximunHeartRate() * value4;
        double exp5 = calculateMaximunHeartRate() * value5;
        double exp6 = calculateMaximunHeartRate() * value6;
        double expectedHeartRate2 = calculateMaximunHeartRate() * maxValue;

        double[] arreglo = new double[8];
        arreglo[0] = expectedHeartRate1;
        arreglo[1] = exp1;
        arreglo[2] = exp2;
        arreglo[3] = exp3;
        arreglo[4] = exp4;
        arreglo[5] = exp5;
        arreglo[6] = exp6;
        arreglo[7] = expectedHeartRate2;

        return new String[]{Arrays.toString(arreglo)};
    }


}
