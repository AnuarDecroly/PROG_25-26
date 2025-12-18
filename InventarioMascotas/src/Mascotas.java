import java.time.LocalDate;

public abstract class Mascotas {

    protected String nombre;
    protected int edad;
    protected String estado;
    protected LocalDate fecha_nacimiento;

    public Mascotas(String nombre, int edad, String estado, LocalDate fecha_nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
    }

//    public String getNombre() {
//        return nombre;
//    }


    public abstract String muestra();

    public abstract String habla();

    public String cumpleaños(){
        String mensaje = "No es mi cumple";
        if(this.fecha_nacimiento.getDayOfYear() == LocalDate.now().getDayOfYear()){
            this.edad ++;
            mensaje = "Es mi cumple y cumplo "+this.edad;

        }
        return mensaje;
    }

    public String morir(){
        return "Siento dejar este mundo sin probar pipas facundo";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mascotas{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", fecha_nacimiento=").append(fecha_nacimiento);
        sb.append('}');
        return sb.toString();
    }
}
