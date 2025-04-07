package capitulo3.ejercicios.ejercicio316;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

public class TestFrecuenciasCardiacas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Solicitud de la información
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del paciente: ");
        String apellido = sc.nextLine();

        System.out.println("Ingrese el año de nacimiento del paciente: ");
        int anioNacimiento = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento del paciente: ");
        int mesNacimiento = sc.nextInt();
        System.out.println("Ingrese el dia de nacimiento del paciente: ");
        int diaNacimiento = sc.nextInt();

        FrecuenciasCardiacas frecuenciasCardiacas = new FrecuenciasCardiacas(nombre, apellido, LocalDate.of(
                anioNacimiento, mesNacimiento, diaNacimiento
        ));


        Logger logger = Logger.getLogger(String.valueOf(TestFrecuenciasCardiacas.class));
        logger.info("La edad es: %s años".formatted(frecuenciasCardiacas.calculateAge(LocalDate.now())));
        logger.info("Frecuencia cardiaca máxima: %d".formatted(frecuenciasCardiacas.calculateMaximunHeartRate()));
        logger.info("rango de frecuencias cardiacas esperadas: %s".formatted(frecuenciasCardiacas.calculateExpectedHeartRate()));




    }


}
