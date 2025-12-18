import java.time.LocalDate;

public class Canario extends Aves{

    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, LocalDate fecha_nacimiento, String pico, boolean vuela,
                   String color, boolean canta) {
        super(nombre, edad, estado, fecha_nacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isCanta() {
        return this.canta;
    }


    @Override
    public String volar() {
        return "Soy un canario y claro que puedo volar";
    }

    @Override
    public String muestra() {
        return "Soy un " + this.getClass().getSimpleName() + "y me llamo " + super.nombre;
    }

    @Override
    public String habla() {
        return "pio pio";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Canario{");
        sb.append("color='").append(color).append('\'');
        sb.append(", canta=").append(canta);
        sb.append(", pico='").append(pico).append('\'');
        sb.append(", vuela=").append(vuela);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", fecha_nacimiento=").append(fecha_nacimiento);
        sb.append('}');
        return sb.toString();
    }
}
