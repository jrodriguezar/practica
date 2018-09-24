package equipo;

/**
 *
 * @author Estudiante
 */
public class Jugadores {
    private String nombre;

    public Jugadores(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + '}';
    }
    
}
