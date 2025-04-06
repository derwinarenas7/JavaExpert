package capitulo3.ejercicios.ejercicio311;

public class Cuenta {

    private String name;
    private String surname;
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

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public void withdraw(double debitAmount) {
        if (this.balance < debitAmount) {
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        } else {
            this.balance = this.balance - debitAmount;
            //this.balance -= debitAmount;
            System.out.println("su nuevo saldo es de: " + this.balance);
        }
    }




}
