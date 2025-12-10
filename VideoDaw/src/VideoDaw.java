import java.time.LocalDate;
import java.time.LocalDateTime;

public class VideoDaw {

    private String cif;
    private String direccion;
    private LocalDate fechaAlta;
    private Pelicula [] peliculasRegistradas;
    private Cliente[] clientesRegistrados;

    //variables auxiliares nuestras
    private int contadorPeliculas = 0;
    private int contadorClientes = 0;

    public VideoDaw(String cif, String direccion) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = LocalDate.now();
        this.peliculasRegistradas = new Pelicula[10];
        this.clientesRegistrados = new Cliente[10];
    }

    public String getCif() {
        return cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String mostrarInfoVideoClub(){
        final StringBuilder sb = new StringBuilder("VideoDaw{");
        sb.append("cif='").append(cif).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", fechaAlta=").append(fechaAlta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoDaw{");
        sb.append("cif='").append(cif).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", fechaAlta=").append(fechaAlta);
        sb.append('}');
        return sb.toString();
    }

    public String mostrarPeliculasRegistradas(){
        String info = "No hay peliculas registradas";
        if(this.contadorPeliculas > 0){
            info = "";
            for(int i = 0; i < this.contadorPeliculas; i++){
                info += this.peliculasRegistradas[i].toString() + "\n";
            }
        }
        return info;
    }

    public String mostrarClientesRegistrados(){
        String info = "No hay clientes registrados";
        if(this.contadorClientes > 0){
            info = "";
            for(int i = 0; i < this.contadorClientes; i++){
                info += this.clientesRegistrados[i].toString() + "\n";
            }
        }
        return info;
    }

    public boolean alquilarPelicula(Pelicula pelicula, Cliente cliente){
        boolean resultado = false;

        if(this.contadorPeliculas > 0 && this.contadorClientes > 0){
            boolean existeCliente = false;
            int indexCliente = -1;
            for(int i = 0; i < this.contadorClientes; i++){
                if(this.clientesRegistrados[i].getDni().equalsIgnoreCase(cliente.getDni())
                && this.clientesRegistrados[i].getFechaBaja() == null){
                    existeCliente = true;
                    indexCliente = i;
                }
            }

            boolean existePelicula = false;
            int indexPelicula = -1;
            for(int i = 0; i < this.contadorPeliculas; i++){
                if(this.peliculasRegistradas[i].getCodigo().equalsIgnoreCase(pelicula.getCodigo())
                        && this.peliculasRegistradas[i].isEsAlquilada() == false
                        && this.peliculasRegistradas[i].getFechaBaja() == null){
                    existePelicula = true;
                    indexPelicula = i;
                }
            }

            if(existeCliente && existePelicula){
                this.peliculasRegistradas[indexPelicula].setEsAlquilada(true);
                this.peliculasRegistradas[indexPelicula].setFechaAlquiler(LocalDateTime.now());
                this.clientesRegistrados[indexCliente].alquilarPelicula(this.peliculasRegistradas[indexPelicula]);
            }
        }

        return resultado;
    }

    public boolean devolverPelicula(Pelicula pelicula, Cliente cliente){
        boolean resultado = false;

        return resultado;
    }

    public boolean eliminarCliente(Cliente cliente){
        boolean resultado = false;

        if(cliente != null) {
            int index = -1;
            for(int i = 0; i < this.contadorClientes; i++) {
                if (this.clientesRegistrados[i] != null) {
                    if (this.clientesRegistrados[i].getDni().equalsIgnoreCase(cliente.getDni())) {
                        index = i;
                        break; //para eliminar la primera ocurrencia
                    }
                }
            }

            if(index != -1){
                this.clientesRegistrados[index] = null;
                resultado = true;

                this.clientesRegistrados[index] = this.clientesRegistrados[this.contadorClientes- 1];
                this.clientesRegistrados[contadorClientes- 1] = null;
                this.contadorClientes--;
            }
        }
        return  resultado;
    }

    public boolean darBajaCliente(Cliente cliente){
        boolean resultado = false;

        if(cliente != null) {
            int index = -1;
            for(int i = 0; i < this.contadorClientes; i++) {
                if (this.clientesRegistrados[i] != null) {
                    if (this.clientesRegistrados[i].getDni().equalsIgnoreCase(cliente.getDni())) {
                        this.clientesRegistrados[i].setFechaBaja(LocalDate.now());
                        break; //para eliminar la primera ocurrencia
                    }
                }
            }
        }
        return  resultado;

    }

    public boolean registrarCliente(Cliente cliente){
        boolean resultado = false;
        if(cliente != null) {
            int index = -1;
            for(int i = 0; i < this.contadorClientes; i++) {
                if (this.clientesRegistrados[i].getDni().equalsIgnoreCase(cliente.getDni())) {
                    index = i;
                    break;
                }
            }
            if(index == -1){
                this.clientesRegistrados[this.contadorClientes] = cliente;
                this.contadorClientes++;
            }
        }
        return resultado;
    }

    public boolean registrarPelicula(Pelicula pelicula){
        boolean resultado = false;
        if(pelicula != null) {
            int index = -1;
            for(int i = 0; i < this.contadorPeliculas; i++) {
                if (this.peliculasRegistradas[i].getCodigo().equalsIgnoreCase(pelicula.getCodigo())) {
                    index = i;
                    break;
                }
            }

            if(index == -1){
                this.peliculasRegistradas[this.contadorPeliculas] = pelicula;
                this.contadorPeliculas++;
            }
        }
        return resultado;
    }


}
