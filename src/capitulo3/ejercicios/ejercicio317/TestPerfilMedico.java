package capitulo3.ejercicios.ejercicio317;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Logger;

public class TestPerfilMedico {

    public static void main(String[] args) {


        Logger logger = Logger.getLogger(String.valueOf(TestPerfilMedico.class));
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre del paciente: ");
        String nombre = sc.nextLine();
        System.out.println("Digite el apellido del paciente: ");
        String apellido = sc.nextLine();
        System.out.println("Digite el sexo del paciente: ");
        String sexo = sc.nextLine();

        System.out.println("Digite el año de nacimiento del paciente: ");
        int anio = sc.nextInt();
        System.out.println("Digite el mes de nacimiento del paciente: ");
        int mes = sc.nextInt();
        System.out.println("Digite el dia de nacimiento del paciente: ");
        int dia = sc.nextInt();

        System.out.println("Digite la altura del paciente: ");
        double altura = sc.nextDouble();
        System.out.println("Digite el peso del paciente: ");
        double peso = sc.nextDouble();

        PerfilMedico perfilMedico = new PerfilMedico(
                nombre,
                apellido,
                sexo,
                LocalDate.of(anio,mes,dia),
                altura,
                peso
        );

        logger.info("edad: %d".formatted(perfilMedico.calcularEdad()));
        logger.info("IMC: %f".formatted(perfilMedico.calcularIMC(peso, altura)));


    }



}
