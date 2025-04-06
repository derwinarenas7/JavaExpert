package capitulo3.ejercicios.ejercicio315;

public class Cuenta {

    private String name;
    private double balance;

    public Cuenta(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            //this.balance = this.balance + depositAmount;
            this.balance += depositAmount;
        }
    }


}
