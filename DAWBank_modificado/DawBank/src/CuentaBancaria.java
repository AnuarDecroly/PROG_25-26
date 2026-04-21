import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * Representa una cuenta bancaria que gestiona el saldo, los datos del titular
 * y el historial de movimientos.
 * <p>
 * Implementa la interfaz {@link Serializable} para permitir la serialización
 * y persistencia del estado del objeto.
 * </p>
 *
 * @author Anuar
 * @version 1.0
 */
public class CuentaBancaria implements Serializable {

    private static final long serialVersionUID = 9024679548520954005L;

    private String IBAN;
    private Cliente titular;
    private double saldo;

    private List<Movimiento> movimientos;

    private int contadorMovimientos;

    /**
     * Crea una nueva instancia de {@code CuentaBancaria}.
     * Instancia automáticamente un nuevo objeto {@link Cliente} y una lista vacía de movimientos.
     *
     * @param IBAN      El Código Internacional de Cuenta Bancaria.
     * @param nombre    El nombre completo del titular.
     * @param dni       El DNI o documento de identidad del titular.
     * @param direccion La dirección de residencia del titular.
     * @param email     El correo electrónico de contacto del titular.
     * @param telefono  El número de teléfono del titular.
     * @param fecha     La fecha de nacimiento o alta del titular.
     */
    public CuentaBancaria(String IBAN, String nombre, String dni,
                          String direccion, String email, String telefono, LocalDate fecha) {
        this.IBAN = IBAN;
        this.titular = new Cliente(nombre, dni, fecha, direccion, email, telefono);
        this.movimientos = new LinkedList<Movimiento>();
        this.saldo = 0.0;

        this.contadorMovimientos = 0;
    }

    /**
     * Obtiene el código IBAN de la cuenta bancaria.
     *
     * @return Una cadena de texto con el IBAN.
     */
    public String getIBAN() {
        return this.IBAN;
    }

    /**
     * Obtiene el titular asociado a la cuenta.
     *
     * @return El objeto {@link Cliente} que figura como titular.
     */
    public Cliente getTitular() {
        return this.titular;
    }

    /**
     * Obtiene el saldo actual disponible en la cuenta.
     *
     * @return El saldo expresado en formato decimal.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Realiza un ingreso de dinero en la cuenta y registra el movimiento.
     * El valor ingresado se convierte a su valor absoluto para evitar errores de signo.
     *
     * @param valor La cantidad de dinero a ingresar.
     * @return {@code true} si el movimiento de ingreso se ha registrado correctamente en la lista.
     * @throws AvisarHaciendaException Si el importe del ingreso es superior a 3000€.
     */
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

    /**
     * Realiza una retirada de dinero de la cuenta y registra el movimiento.
     * El saldo de la cuenta tras la operación nunca puede ser inferior a -50€.
     *
     * @param valor La cantidad de dinero a retirar. Se usará su valor absoluto.
     * @return {@code true} si el movimiento de retirada se ha registrado correctamente en la lista.
     * @throws CuentaException         Si la operación dejaría la cuenta con un saldo inferior a -50€.
     * @throws AvisarHaciendaException Si el importe de la retirada es superior a 3000€.
     */
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

    /**
     * Devuelve una representación en forma de cadena de texto de la cuenta bancaria.
     *
     * @return Cadena que incluye el IBAN, el titular y el saldo actual.
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuentaBancaria{");
        sb.append("IBAN='").append(IBAN).append('\'');
        sb.append(", titular=").append(titular.toString());
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Genera un informe en texto con todo el historial de movimientos de la cuenta.
     *
     * @return Una cadena con cada movimiento en una nueva línea.
     * Si no existen movimientos, retorna el mensaje "No hay movimientos".
     */
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
