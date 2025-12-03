import java.time.LocalDate;
import java.time.LocalDateTime;

public class MiCalculadora implements ICalculadora, ICalendar {

    @Override
    public double sumar(double a, double b) {
        return a + b;

    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if(b != 0) {
            return a / b;
        }else{
            return Double.MIN_VALUE;
        }

    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    @Override
    public LocalDate hoy() {
        return null;
    }

    @Override
    public LocalDateTime hora() {
        return null;
    }
}
