package equipo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args){
        Equipo e = new Equipo("U");
        Jugadores j1 = new Jugadores("V");
        boolean resultado = e.addJugador(j1);
        if (resultado==true) {
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
        
        ArrayList<Jugadores> lista = e.getJugadores();
        for (Jugadores jugador : lista) {
            System.out.println(jugador.getNombre());
        }
        
        for (int i = 0; i < lista.size(); i++) {
            Jugadores jugador = lista.get(i);
            System.out.println(jugador.getNombre());
        }
        
        
    }
}