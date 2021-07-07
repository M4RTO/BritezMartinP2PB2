package ar.edu.unlam.pb2.eva02;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TorneoTest {

    @Test
    public void crearTorneo(){

        Equipo equipoVisitante = new Equipo("Argentina",Lado.VISITANTE);
        Equipo equipoLocal = new Equipo("Brasil",Lado.LOCAL);
        Partido partido1 = new Partido("Partido-1",equipoVisitante,equipoLocal);

        HashSet<Partido> partidos = new HashSet<>();
        partidos.add(partido1);

        Jugador jugador1 = new Jugador(34277638,"Rodrigo","de Paul",equipoVisitante, Tipo.JUGADOR, "MED", 23);
        Jugador jugador2 = new Jugador(34277638,"Carlos","Tevez",equipoVisitante, Tipo.JUGADOR, "DEL", 10);

        List<Persona> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);

        Anotacion anotacion1 = new Anotacion(1,jugador1.getNumeroCamiseta(),jugador1.getEquipo().getLado());
        Map<Integer,Anotacion> anotaciones = new HashMap<>();
        anotaciones.put(12,anotacion1);


        Torneo torneo = new Torneo("Coca-cola",partidos,jugadores,anotaciones);

        Assert.assertNotNull(torneo);
    }

    @Test
    public void registrarMiembrosAlTorneo() {
        Equipo equipoVisitante = new Equipo("Argentina",Lado.VISITANTE);
        Jugador jugador1 = new Jugador(34277638,"Rodrigo","de Paul",equipoVisitante, Tipo.JUGADOR, "MED", 23);
        Jugador jugador2 = new Jugador(34277638,"Carlos","Tevez",equipoVisitante, Tipo.JUGADOR, "DEL", 10);
        DirectorTecnico dt = new DirectorTecnico(34277638,"Carlos","Bianchi",equipoVisitante,Tipo.DT);

        Torneo torneo = new Torneo("Coca-cola");

        torneo.registrarParticipante(jugador1);
        torneo.registrarParticipante(jugador2);
        torneo.registrarParticipante(dt);

        Assert.assertEquals(3,torneo.getParticipantes().size());
    }

    @Test
    public void registrarPartidosAlTorneo() {
        Equipo equipoVisitante = new Equipo("Argentina",Lado.VISITANTE);
        Equipo equipoLocal = new Equipo("Brasil",Lado.LOCAL);

        Torneo torneo = new Torneo("Coca-cola");
        Partido partido1 = new Partido("Partido-1",equipoVisitante,equipoLocal);


       torneo.registrarPartido(partido1);

        Assert.assertEquals(1,torneo.getPartidos().size());
    }

    @Test
    public void registrarNominaDeJugadoresAlPartidos() {
        Equipo equipoVisitante = new Equipo("Argentina",Lado.VISITANTE);
        Equipo equipoLocal = new Equipo("Brasil",Lado.LOCAL);

        Jugador jugador1 = new Jugador(34277638,"Rodrigo","de Paul",equipoVisitante, Tipo.JUGADOR, "MED", 23);
        Jugador jugador2 = new Jugador(34277638,"Carlos","Tevez",equipoVisitante, Tipo.JUGADOR, "DEL", 10);
        Jugador jugador3 = new Jugador(132123,"Rodrigo","de Paul",equipoLocal, Tipo.JUGADOR, "MED", 23);
        Jugador jugador4 = new Jugador(5252,"PAblo","pila",equipoLocal, Tipo.JUGADOR, "DEL", 10);
        DirectorTecnico dt1 = new DirectorTecnico(34277638,"Carlos","Bianchi",equipoVisitante,Tipo.DT);
        DirectorTecnico dt2 = new DirectorTecnico(34277638,"Carlos","Bianchi",equipoLocal,Tipo.DT);


        Torneo torneo = new Torneo("Coca-cola");
        Partido partido1 = new Partido("Partido-1",equipoVisitante,equipoLocal);


        torneo.registrarParticipante(jugador1);
        torneo.registrarParticipante(jugador2);
        torneo.registrarParticipante(jugador3);
        torneo.registrarParticipante(jugador4);
        torneo.registrarParticipante(dt1);
        torneo.registrarParticipante(dt2);

        torneo.registrarPartido(partido1);

        torneo.registrarNominaParaElPartido(partido1);

        Assert.assertEquals(2,partido1.getEquipoLocal().getJugadores().size());
        Assert.assertEquals(2,partido1.getEquipoVisitante().getJugadores().size());

    }

    @Test
    public void registrarGolDelPartido() {
        Equipo equipoVisitante = new Equipo("Argentina",Lado.VISITANTE);
        Equipo equipoLocal = new Equipo("Brasil",Lado.LOCAL);

        Jugador jugador1 = new Jugador(34277638,"Rodrigo","de Paul",equipoVisitante, Tipo.JUGADOR, "MED", 23);
        Jugador jugador2 = new Jugador(34277638,"Carlos","Tevez",equipoVisitante, Tipo.JUGADOR, "DEL", 10);
        Jugador jugador3 = new Jugador(132123,"Rodrigo","de Paul",equipoLocal, Tipo.JUGADOR, "MED", 23);
        Jugador jugador4 = new Jugador(5252,"PAblo","pila",equipoLocal, Tipo.JUGADOR, "DEL", 10);
        DirectorTecnico dt1 = new DirectorTecnico(34277638,"Carlos","Bianchi",equipoVisitante,Tipo.DT);
        DirectorTecnico dt2 = new DirectorTecnico(34277638,"Carlos","Bianchi",equipoLocal,Tipo.DT);


        Torneo torneo = new Torneo("Coca-cola");
        Partido partido1 = new Partido("Partido-1",equipoVisitante,equipoLocal);


        torneo.registrarParticipante(jugador1);
        torneo.registrarParticipante(jugador2);
        torneo.registrarParticipante(jugador3);
        torneo.registrarParticipante(jugador4);
        torneo.registrarParticipante(dt1);
        torneo.registrarParticipante(dt2);

        torneo.registrarPartido(partido1);

        torneo.registrarNominaParaElPartido(partido1);

        torneo.registrarGol(partido1.getId(),jugador1.getNumeroCamiseta(),jugador1.getEquipo().getLado(),40);

        Assert.assertEquals(1,torneo.getAnotaciones().size());

    }
}
