package hashmap;
import java.util.HashMap;
/**
 *
 * @author Estudiante
 */
public class EquipoH {
    private String nombre;
    private HashMap<Integer,JugadorH> jugadores;

    public EquipoH(String nombre) {
        this.nombre = nombre;
        this.jugadores = new HashMap<>();
    }
    
    public boolean addJugador(JugadorH jugador){
        JugadorH j = this.jugadores.put(jugador.getCedula(), jugador);
        if (j!=null) {
            return true;
        }else{
            return false;
        }
    }
    
    public HashMap getJugadores(){
        return this.jugadores;
    }
}
