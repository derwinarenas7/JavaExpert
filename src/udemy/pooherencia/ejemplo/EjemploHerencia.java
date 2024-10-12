package udemy.pooherencia.ejemplo;

import udemy.pooherencia.Alumno;
import udemy.pooherencia.AlumnoInternacional;
import udemy.pooherencia.Profesor;

public class EjemploHerencia {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Derwin Arenas");
        System.out.println("alumno = " + alumno);

        Profesor profesor = new Profesor();
        profesor.setNombre("Jose");
        profesor.setApellido("Hoyos");
        profesor.setAsignatura("Matemáticas");
        System.out.println(profesor);

        AlumnoInternacional alumInt = new AlumnoInternacional();

        Class clase = alumInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }



    }

}
