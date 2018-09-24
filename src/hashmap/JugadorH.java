package hashmap;

/**
 *
 * @author Estudiante
 */
public class JugadorH {
    private String nombre;
    private int cedula;
    
    public JugadorH(int cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
