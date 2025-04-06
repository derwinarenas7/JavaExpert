package capitulo3.ejercicios.ejercicio313;

import java.util.logging.Logger;

public class Employee {

    private String name;
    private String surname;
    private double MonthlySalary;

    Logger logger = Logger.getLogger(String.valueOf(Employee.class));
    public Employee(String name, String surname, double MonthlySalary) {
        this.name = name;
        this.surname = surname;
        this.MonthlySalary = MonthlySalary;
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
        return surname;
    }

    public void setSalary(double MonthlySalary) {
        if (MonthlySalary < 0) {
            logger.info("No es posible establecer el salario.");
        } else {
            this.MonthlySalary = MonthlySalary;
        }
    }

    public double getSalary() {
        return MonthlySalary;
    }



}
