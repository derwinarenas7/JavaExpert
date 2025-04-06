package capitulo3.ejercicios.ejercicio312;

import java.util.logging.Logger;

public class InvoiceTest {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(String.valueOf(InvoiceTest.class));

        Invoice invoice = new Invoice(
                "14589-1",
                "Pieza del motor",
                25,
                526.452);

        logger.info("el monto total de la factura es: " +
                invoice.getInvoiceAmount());

    }
}
