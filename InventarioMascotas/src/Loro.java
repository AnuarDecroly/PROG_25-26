import java.time.LocalDate;

public class Loro extends Aves{

    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, LocalDate fecha_nacimiento, String pico, boolean vuela,
                String origen, boolean habla) {
        super(nombre, edad, estado, fecha_nacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String Saludar(){
        String saludo = "No puedo saludar todavia";
        if(this.habla){
            saludo = "Holaaaa";
        }
        return saludo;
    }

    @Override
    public String volar() {
        return "Soy un loro y claro que puedo volar";
    }

    @Override
    public String muestra() {
        return "Soy un " + this.getClass().getSimpleName() + "y me llamo " + super.nombre;
    }

    @Override
    public String habla() {
        return "Grmm Grmmm o parecido";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Loro{");
        sb.append("origen='").append(origen).append('\'');
        sb.append(", habla=").append(habla);
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
