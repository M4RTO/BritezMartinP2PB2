package ar.edu.unlam.pb2.eva02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TorneoTest {

    @Test
    public void crearTorneo(){

        Equipo equipoVisitante = new Equipo("Argentina");
        Equipo equipoLocal = new Equipo("Brasil");
        Partido partido1 = new Partido("Partido-1",equipoVisitante,equipoLocal);

        HashSet<Partido> partidos = new HashSet<>();
        partidos.add(partido1);

        Jugador jugador1 = new Jugador(34277638,"Rodrigo","de Paul","MED",equipoVisitante,Tipo.JUGADOR);
        Jugador jugador2 = new Jugador(34277638,"Carlos","Tevez","DEL",equipoVisitante,Tipo.JUGADOR);

        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);

        List<Anotacion> anotaciones = new ArrayList<>();





        Torneo torneo = new Torneo("Coca-cola",partidos,jugadores,anotaciones);
    }
}
