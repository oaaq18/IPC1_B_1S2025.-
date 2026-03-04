
package practicas.ipc1_bs12026_p1;
import java.time.LocalDateTime;

public class Venta {

    private String CodigoProducto;
    private int Cantidad;
    private LocalDateTime FechayHora;
    private double Total;

    // Constructor
    public Venta(String codigoProducto, int cantidad, double total) {

        if (codigoProducto == null || codigoProducto.isEmpty()) {
            throw new IllegalArgumentException("Cdigo invalido");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad debe ser mayor a 0");
        }

        if (total <= 0) {
            throw new IllegalArgumentException("Total invalido");
        }

        this.CodigoProducto = codigoProducto;
        this.Cantidad = cantidad;
        this.Total = total;
        this.FechayHora = LocalDateTime.now();
    }

    // Getters
    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public LocalDateTime getFechaHora() {
        return FechayHora;
    }

    public double getTotal() {
        return Total;
    }

    @Override
    public String toString() {
        return "Codigo Producto: " + CodigoProducto +
               ", Cantidad: " + Cantidad +
               ", Total: Q" + Total +
               ", Fecha: " + FechayHora;
    }
}

