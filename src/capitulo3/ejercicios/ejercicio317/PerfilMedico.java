package capitulo3.ejercicios.ejercicio317;

import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {

    private String nombre;
    private String apellido;
    private String sexo;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, LocalDate fechaNacimiento, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Método para calcular la edad
     */

    public int calcularEdad() {
        int edad;
        edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        return edad;
    }

    public double calcularIMC(double peso, double altura) {

        double IMC = (peso) / (altura * altura);
        System.out.println(IMC);
        return IMC;
    }

}
