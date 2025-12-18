import java.time.LocalDate;

public class Gato extends Mascotas{

    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, LocalDate fecha_nacimiento,
                String color, boolean peloLargo) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    @Override
    public String muestra() {
        return "Soy un " + this.getClass().getSimpleName() + "y me llamo " + super.nombre;
    }

    @Override
    public String habla() {
        return "Soy un gato y hago miauu miauu";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gato{");
        sb.append("color='").append(color).append('\'');
        sb.append(", peloLargo=").append(peloLargo);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", fecha_nacimiento=").append(fecha_nacimiento);
        sb.append('}');
        return sb.toString();
    }
}
