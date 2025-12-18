import java.time.LocalDate;

public class Perro extends Mascotas{

    private String raza;

    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, LocalDate fecha_nacimiento,
                 String raza, boolean pulgas) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public String muestra() {
        return "Soy un " + this.getClass().getSimpleName() + "y me llamo " + super.nombre;
    }

    @Override
    public String habla() {
        return "Soy un perro y hago wauff wauff";
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return this.raza;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Perro{");
        sb.append("raza='").append(raza).append('\'');
        sb.append(", pulgas=").append(pulgas);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", fecha_nacimiento=").append(fecha_nacimiento);
        sb.append('}');
        return sb.toString();
    }
}
