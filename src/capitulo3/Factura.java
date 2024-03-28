package capitulo3;

public class Factura {

    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidad;
    private double precio;

    public Factura(String numeroDePieza, String descripcionDePieza, int cantidad, double precio) {
        this.numeroDePieza = numeroDePieza;
        this.descripcionDePieza = descripcionDePieza;
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
        if (precio >= 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }

    }

    public void setNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public String getNumeroDePieza() {
        return numeroDePieza;
    }

    public void setDescripcionDePieza(String descripcionDePieza) {
        this.descripcionDePieza = descripcionDePieza;
    }

    public String getDescripcionDePieza() {
        return descripcionDePieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        if (precio >= 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public double obtenerMontoFactura() {
        return (double) cantidad * precio;
    }




}
