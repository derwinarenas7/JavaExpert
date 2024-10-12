package udemy.pooclasesabstractas.form;

import udemy.pooclasesabstractas.form.elementos.*;
import udemy.pooclasesabstractas.form.elementos.select.Opcion;
import udemy.pooclasesabstractas.form.validador.EmailValidador;
import udemy.pooclasesabstractas.form.validador.LargoValidador;
import udemy.pooclasesabstractas.form.validador.NoNuloValidador;
import udemy.pooclasesabstractas.form.validador.RequeridoValidador;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador());

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new RequeridoValidador());

        TextAreaForm exp = new TextAreaForm("expe", 4, 4);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "PHP"));
        lenguaje.addOpcion(new Opcion("4", "Ruby"));
        lenguaje.addOpcion(new Opcion("5", "C++"));

        ElementoForm saludarImp = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "name= " + this.nombre + " value=" + this.valor;
            }
        };

        saludarImp.setValor("Hola este campo no funciona");
        username.setTipo("jhon.doe");
        password.setValor("4424");
        email.setValor("jhondoe@correo.com");
        edad.setValor("28");
        exp.setValor("... más de 10 años");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(
                username, password, email, exp, lenguaje, saludarImp
        );

        /*for (ElementoForm e : elementos){
            System.out.println(e.dibujarHtml());
        }*/

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
        });

        elementos.forEach(e -> {
            if (!e.esValido()) {
                e.getErrores().forEach(err -> System.out.println(err));
            }
        });




    }
}
