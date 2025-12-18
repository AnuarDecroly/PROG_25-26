import java.time.LocalDate;

public abstract class Aves extends Mascotas{

    protected String pico;
    protected boolean vuela;


    public Aves(String nombre, int edad, String estado, LocalDate fecha_nacimiento,
                String pico, boolean vuela) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public abstract String volar();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aves{");
        sb.append("pico='").append(pico).append('\'');
        sb.append(", vuela=").append(vuela);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", fecha_nacimiento=").append(fecha_nacimiento);
        sb.append('}');
        return sb.toString();
    }
}
