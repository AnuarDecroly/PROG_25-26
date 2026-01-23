public class ExcesoVelocidad2Exception extends Exception {

    private static final long serialVersionUID = -6384905737246456587L;

    private int velocidad;


    public ExcesoVelocidad2Exception(int velocidad){
        super("Exceso de velocidad registrado: su velocidad");
        this.velocidad = velocidad;
    }

    @Override public String toString() {
        return "ExcesoVelocidad2Exception [nuevaVelocidad=" + velocidad + "]";
    }
}
