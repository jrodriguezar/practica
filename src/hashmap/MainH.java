package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Estudiante
 */
public class MainH {
    public static void main(String [] args){
        EquipoH e = new EquipoH("U");
        JugadorH j1 = new JugadorH(123, "V");
        e.addJugador(j1);
        
        HashMap jugadores = e.getJugadores();
        ///buscar por clave
        JugadorH jugador = (JugadorH) jugadores.get(123);
        System.out.println(jugador.getNombre());
        
        JugadorH jugador1 = 
                (JugadorH) jugadores.get(123);
        System.out.println(jugador1.getNombre());
        
        ArrayList<JugadorH> jgs =
                (ArrayList) jugadores.values();
        for (JugadorH jg: jgs) {
            System.out.println(jg);
        }
    }
}
