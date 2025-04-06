package capitulo3.ejercicios.ejercicio313;

import java.util.logging.Logger;

public class EmployeeTest {


    public static void main(String[] args) {

        Logger logger = Logger.getLogger(String.valueOf(EmployeeTest.class));

        Employee employee1 = new Employee("Derwin", "Arenas", 1853);
        Employee employee2 = new Employee("Angie", "Díaz", 1236);

        System.out.println("========= basic salary =========");
        System.out.println("anual salary for employee1: " + employee1.getSalary() * 12);
        System.out.println("anual salary for employee2: " + employee2.getSalary() * 12);

        System.out.println();

        System.out.println("========= salary with an increase =========");
        System.out.println("anual salary for employee1: " + ((employee1.getSalary() * 12 * 0.1) + (employee1.getSalary() * 12))*12);
        System.out.println("anual salary for employee2: " + ((employee2.getSalary() * 12 * 0.1) + (employee2.getSalary() * 12))*12);




    }




}
