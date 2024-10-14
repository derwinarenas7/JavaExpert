package udemy.poo_interfaces;

import udemy.poo_interfaces.modelo.*;
import static udemy.poo_interfaces.modelo.Imprimible.imprimir;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum(
                "Ingeniero muy bueno programando",
                new Persona("Derwin", "Arenas"),
                "Ingeniero Aeronáutico"
        );

        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular");

        Libro libro = new Libro(
                new Persona("Derwin", "Arenas"),
                "Patrones de diseño",
                Genero.INVESTIGACION
        );

        libro.addPagina(new Pagina("Patrón Builder"))
                .addPagina(new Pagina("Patrón Observer"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Facade"));


        Informe informe = new Informe(
                "Análisis de microservicios",
                new Persona("Derwin", "Arenas"),
                new Persona("Jhon", "Charris")
        );

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        /*
        * Podemos crear clases anónimas de las interfaces
        * */

        imprimir(new Imprimible() {

            @Override
            public String imprimir() {
                return "Hola, clase genérica";
            }

        });

    }


}
