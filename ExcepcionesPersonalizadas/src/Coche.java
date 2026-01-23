import java.io.Serializable;

public class Coche {


    private String marca;
    private String modelo;
    private int velocidad;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }


    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }


    @Override public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidad="+velocidad +"]";
    }

    public void acelerar(int v) throws ExcesoVelocidad2Exception{
        this.velocidad = this.velocidad + v;
        if(this.velocidad > 120) {
            //throw new ExcesoVelocidadException(v);
            throw new ExcesoVelocidad2Exception(v);
        }
    }

    public void frenar(int cuanto) {
        this.velocidad = this.velocidad - cuanto;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
