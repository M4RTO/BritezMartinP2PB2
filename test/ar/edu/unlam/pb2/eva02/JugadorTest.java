package ar.edu.unlam.pb2.eva02;

import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {


    @Test
    public void crearJugador(){
        Equipo equipo = new Equipo("Argentina",Lado.VISITANTE);
        Jugador jugador1 = new Jugador(34277638,"Rodrigo","de Paul",equipo, Tipo.JUGADOR, "MED", 23);
        Jugador jugador2 = new Jugador(34277638,"Carlos","Tevez",equipo, Tipo.JUGADOR, "DEL", 10);

        Assert.assertNotNull(jugador1);
        Assert.assertNotNull(jugador2);
    }
}
