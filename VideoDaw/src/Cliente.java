import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String nombre;
    private String dni;
    private String numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private Pelicula[] peliculas;

    private static int contadorSocios = 0;
    private int contadorPeliculas = 0;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Cliente(String nombre, String dni, String direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;

        this.fechaBaja = null;
        this.peliculas = new Pelicula[10];
        this.numSocio = "S-00"+contadorSocios;
        contadorSocios ++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String mostrarInfoCliente() {
        return "Cliente{" +
                "dni='" + this.dni + '\'' +
                ", nombre='" + this.nombre + '\'' +
                ", numSocio='" + this.numSocio + '\'' +
                ", direccion='" + this.direccion + '\'' +
                ", fechaNacimiento=" + this.fechaNacimiento.format(this.formatter) +
                ", fechaBaja=" + this.fechaBaja.format(this.formatter) +
                '}';
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nombre='").append(this.nombre).append('\'');
        sb.append(", dni='").append(this.dni).append('\'');
        sb.append(", numSocio='").append(this.numSocio).append('\'');
        sb.append(", direccion='").append(this.direccion).append('\'');
        sb.append(", fechaNacimiento=").append(this.fechaNacimiento);
        sb.append(", fechaBaja=").append(this.fechaBaja);
        sb.append('}');
        return sb.toString();
    }

    public String mostrarPeliculasAlquiladas(){
        String info = "No hay peliculas alquiladas";
        if(this.contadorPeliculas > 0){
            info = "";
            for(int i = 0; i < this.contadorPeliculas; i++){
                info += peliculas[i].toString() + "\n";
            }
        }
        return info;
    }

    public void alquilarPelicula(Pelicula pelicula){
        //Necesita comprobacion de limite del array o ampliar dimension
        this.peliculas[this.contadorPeliculas] = pelicula;
        this.contadorPeliculas++;
    }
}
