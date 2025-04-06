package capitulo3.ejercicios.ejercicio314;

public class Fecha {


    private int month;
    private int day;
    private int year;

    public Fecha(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void showDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }



}
