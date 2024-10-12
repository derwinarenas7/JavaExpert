package udemy.poo_interfaces;

import udemy.poo_interfaces.modelo.Curriculum;
import udemy.poo_interfaces.modelo.Hoja;
import udemy.poo_interfaces.modelo.Informe;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum(
                "Ingeniero muy bueno programando",
                "Derwin Arenas",
                "Ingeniero Aeronáutico"
        );

        cv.addExperiencia("Java")
                .addExperiencia("Oracle")
                .addExperiencia("Spring")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular");

        Informe informe = new Informe(
                "Análisis de microservicios",
                "Derwin Arenas",
                "Jhon Charris"
        );

        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
