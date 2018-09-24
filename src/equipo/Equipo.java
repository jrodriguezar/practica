package equipo;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugadores> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }
    
    public boolean addJugador(Jugadores jugador){
        return this.jugadores.add(jugador);
    }
}
