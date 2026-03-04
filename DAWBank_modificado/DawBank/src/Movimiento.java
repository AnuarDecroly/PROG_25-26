import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento implements Serializable {

    private static final long serialVersionUID = -9127899282415931473L;

    private int id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private double cantidad;

    private static int contadorMovimiento = 0;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public Movimiento() {}

    public Movimiento(Tipo tipo, double cantidad) {
        this.id = contadorMovimiento;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;

        contadorMovimiento++;
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movimiento {");
        sb.append(", id = ").append(id);
        sb.append(", tipo = ").append(tipo);
        sb.append("cantidad = ").append(cantidad);
        sb.append(", fecha = ").append(fecha.format(dtf));
        sb.append('}');
        return sb.toString();
    }
}
