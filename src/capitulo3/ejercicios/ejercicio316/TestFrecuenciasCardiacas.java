package capitulo3.ejercicios.ejercicio316;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestFrecuenciasCardiacas {

    public static void main(String[] args) {

        FrecuenciasCardiacas frecuenciasCardiacas = new FrecuenciasCardiacas(
                "Derwin",
                "Arenas",
                LocalDate.of(1995, 1, 9)
        );

        System.out.println("La edad es: " + frecuenciasCardiacas.calculateAge(LocalDate.now()));





    }


}
