import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String direccion;
    private String CIF;

    private List<Persona> trabajadores;

    public Empresa(String CIF, String direccion, String nombre) {
        this.CIF = CIF;
        this.direccion = direccion;
        this.nombre = nombre;

        this.trabajadores = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCIF() {
        return CIF;
    }

    public boolean registrarTrabajador(Persona trabajador) {
        boolean resultado = false;
        if (trabajadores != null) {
            trabajadores.addLast(trabajador);
            resultado = true;
        }
        return resultado;
    }

    public List<Persona> obtenerTrabajadoresEmpresa() {
        return trabajadores;
    }


}
