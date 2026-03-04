import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CuentaBancaria implements Serializable {

    private static final long serialVersionUID = 9024679548520954005L;

    private String IBAN;
    private Cliente titular;
    private double saldo;

    private List<Movimiento> movimientos;

    private int contadorMovimientos;

    public CuentaBancaria(String IBAN, String nombre, String dni,
                          String direccion, String email, String telefono, LocalDate fecha) {
        this.IBAN = IBAN;
        this.titular = new Cliente(nombre, dni, fecha, direccion, email, telefono);
        this.movimientos = new LinkedList<Movimiento>();
        this.saldo = 0.0;

        this.contadorMovimientos = 0;
    }

    public String getIBAN() {
        return this.IBAN;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean ingresar(double valor) throws AvisarHaciendaException {
        boolean retorno = false;
        double valorAbsoluto = Math.abs(valor);
        this.saldo += valorAbsoluto;
        retorno = this.movimientos.add(new Movimiento(Tipo.INGRESO, valorAbsoluto));
        if(valorAbsoluto > 3000){
            String mensaje = "El titular " + titular.getNombre() +" ha realizado una operacion en la cuenta "+IBAN +
                    " de una cantidad de "+valorAbsoluto;
            throw new AvisarHaciendaException(mensaje);
        }
        return retorno;
    }

    public boolean retirar(double valor) throws CuentaException, AvisarHaciendaException {
        boolean retorno = false;
        double valorAbsoluto = Math.abs(valor);
        if((this.saldo - valorAbsoluto) >= -50) {
            this.saldo -= valorAbsoluto;
            retorno = this.movimientos.add(new Movimiento(Tipo.RETIRADA, valorAbsoluto));
            if(valorAbsoluto > 3000){
                String mensaje = "El titular " + titular.getNombre() +" ha realizado una operacion en la cuenta "+IBAN +
                        " de una cantidad de "+valorAbsoluto;
                throw new AvisarHaciendaException(mensaje);
            }
        }
        else{
            throw new CuentaException("Saldo insuficiente: no puedes tener un saldo inferior a -50€");
        }
        return retorno;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuentaBancaria{");
        sb.append("IBAN='").append(IBAN).append('\'');
        sb.append(", titular=").append(titular.toString());
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public String infoMovimientos() {
        String info = "";
        if(!this.movimientos.isEmpty()) {
            for(Movimiento movimiento : this.movimientos) {
                info += movimiento.toString()+ "\n";
            }
        }else{
            info = "No hay movimientos";
        }
        return info;
    }
}
