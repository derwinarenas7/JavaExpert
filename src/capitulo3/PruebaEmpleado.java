package capitulo3;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(
                "Derwin",
                "Apellido",
                -2654);
        Empleado empleado2 = new Empleado(
                "Angie",
                "Díaz",
                2865);

        double salarioAnual1 = 12 * empleado1.getSalario();
        System.out.println("salario anual empleado1 = " + salarioAnual1);
        double salarioAnual2 = 12 * empleado2.getSalario();
        System.out.println("salario anual empleado2 = " + salarioAnual2);


    }


}
