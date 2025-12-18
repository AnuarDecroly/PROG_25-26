public class Inventario {

    private String nombre;

    private Mascotas [] misMascotas;

    private int mascotasActuales;

    public Inventario(String nombre, int capacidad) {
        this.nombre = nombre;
        this.misMascotas = new Mascotas[capacidad];
        this.mascotasActuales = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean insertarMascota(Mascotas mascota) {
        boolean estado = false;
        if(mascotasActuales < this.misMascotas.length) {
            this.misMascotas[mascotasActuales] = mascota;
            this.mascotasActuales++;
            estado = true;
        }
        return estado;
    }

    public boolean eliminarMascota(Mascotas mascota) {
        boolean estado = false;
        int index = -1;
        if(mascotasActuales > 0) {
            for(int i = 0; i < this.mascotasActuales; i++) {
                if(this.misMascotas[i].nombre == mascota.nombre) {
                    index = i;
                    break;
                }
            }

            if(index != -1) {
                this.misMascotas[index] = this.misMascotas[mascotasActuales - 1];
                this.misMascotas[mascotasActuales - 1] = null;
                this.mascotasActuales--;
                estado = true;
            }
        }
        return estado;
    }

    public boolean vaciarInventario() {
        boolean estado = false;
        if(this.mascotasActuales > 0) {
            this.misMascotas = new  Mascotas[10];
            this.mascotasActuales = 0;
            estado = true;
        }
        return estado;
    }

    public String mostrarInfoMascota(int posicion) {
        String mascota = "No hay mascotas que correspondan";
        if(posicion >= 0 && posicion < this.mascotasActuales) {
            mascota = this.misMascotas[posicion].toString();
        }
        return mascota;
    }

    public String mostrarInfoTodasMascotas(){
        String texto = "";
        if(this.mascotasActuales > 0) {
            for(Mascotas m : this.misMascotas){
                if(m != null) {
                    texto += m.toString();
                }
            }
        }else{
            texto = "No hay mascotas en el inventario";
        }
        return texto;
    }

    public String mostrarInfoBasicaMascotas(){
        String texto = "";
        if(this.mascotasActuales > 0) {
            for(Mascotas mascota : this.misMascotas){
                if(mascota != null) {
                    if(mascota instanceof Perro){
                        Perro perro = (Perro) mascota;
                        texto += perro.muestra();
                    }
                    else if(mascota instanceof Gato){
                        Gato gato = (Gato) mascota;
                        texto += gato.muestra();
                    }
                    else if(mascota instanceof Loro){
                        Loro loro = (Loro) mascota;
                        texto += loro.muestra();
                    }
                    else if(mascota instanceof Canario){
                        Canario canario = (Canario) mascota;
                        texto += canario.muestra();
                    }
                }
            }
        }else{
            texto = "No hay mascotas en el inventario";
        }
        return texto;
    }


}
