public class Biblioteca {

    //Atributos encapsulados
    private String codigo;
    private String nombre;
    private String direccion;
    private String email;
    private String nTelefono;

    //Coleccion (array) de libros en la biblioteca
    private Libro[] libros;
    private int nLibrosActuales;
    private final int dimensionInicial = 100;

    //Constructor
    public Biblioteca(String codigo, String nombre, String direccion, String email, String nTelefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.nTelefono = nTelefono;

        this.libros = new Libro[this.dimensionInicial];

        //Esto es importante para la smartbiblioteca
        this.nLibrosActuales = 0;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnTelefono() {
        return this.nTelefono;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public boolean insertarLibro(Libro libro) {
        boolean resultado = false;

        //Toda la logica para insertar un libro
        if(libro != null) {
            if(this.nLibrosActuales < this.libros.length) {
                //tengo huecos susicientes
                this.libros[this.nLibrosActuales] = libro;
                resultado = true;
                this.nLibrosActuales++;
            }
            else{
                //No tengo huecos suficientes
                this.ampliarDimensionBiblioteca();
                this.libros[this.nLibrosActuales] = libro;
                resultado = true;
                this.nLibrosActuales++;

            }

//            //Algoritmo refinado o refactorizado
//            if(this.nLibrosActuales >= this.libros.length) {
//                this.ampliarDimensionBiblioteca();
//            }
//            this.libros[this.nLibrosActuales] = libro;
//            resultado = true;
//            this.nLibrosActuales++;
        }

        return resultado;
    }

    

    private void ampliarDimensionBiblioteca(){
        Libro[] librosAux = new Libro[this.libros.length + 5];
        for(int i = 0; i < this.libros.length; i++){
            librosAux[i] = this.libros[i];
        }
        this.libros = librosAux;
    }

}
