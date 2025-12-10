import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Pelicula {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private String titulo;
    private String codigo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean esAlquilada;

    public Pelicula(String codigo, String titulo, Genero genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.iniciarPelicula();
    }

    public Pelicula(String titulo, Genero genero) {
        this.codigo = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.genero = genero;
        this.iniciarPelicula();

    }

    private void iniciarPelicula(){
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = null;
        this.fechaAlquiler = null;
        this.esAlquilada = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public boolean isEsAlquilada() {
        return esAlquilada;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setEsAlquilada(boolean esAlquilada) {
        this.esAlquilada = esAlquilada;
    }

    public String mostrarInfoPelicula(){
        return "Pelicula{" +
                "cod='" + this.codigo + '\'' +
                ", titulo='" + this.titulo + '\'' +
                ", genero=" + this.genero +
                ", fechaRegistro=" + this.fechaRegistro.format(this.dtf) +
                ", fechaBaja=" + this.fechaBaja.format(this.dtf)  +
                ", fechaAlquiler=" + this.fechaAlquiler.format(this.dtf)  +
                ", isAlquilada=" + this.esAlquilada +
                '}';
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pelicula{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", fechaRegistro=").append(fechaRegistro.format(this.dtf) );
        sb.append(", fechaBaja=").append(fechaBaja.format(this.dtf) );
        sb.append(", fechaAlquiler=").append(fechaAlquiler.format(this.dtf) );
        sb.append(", esAlquilada=").append(esAlquilada);
        sb.append('}');
        return sb.toString();
    }
}
