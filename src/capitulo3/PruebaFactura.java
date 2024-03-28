package capitulo3;

public class PruebaFactura {

    public static void main(String[] args) {

        Factura factura = new Factura(
                "12345",
                "remache",
                25,
                -2560);

        double monto = factura.obtenerMontoFactura();
        System.out.printf("El precio total es: $%.2f", monto);




    }



}
