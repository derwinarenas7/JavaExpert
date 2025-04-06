package capitulo3.ejercicios.ejercicio312;

import java.util.logging.Logger;

public class Invoice {

    Logger logger = Logger.getLogger(String.valueOf(Invoice.class));

    private String partNumber;
    private String description;
    private int amount;
    private double price;

    public Invoice(String partNumber, String description, int amount, double price) {
        this.partNumber = partNumber;
        this.description = description;
        if (amount < 0) {
            this.amount = 0;
        } else {
            this.amount = amount;
        }
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount() {
        return this.amount * this.price;
    }



}
