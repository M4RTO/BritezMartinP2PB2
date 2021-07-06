package ar.edu.unlam.pb2.eva02;

import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {


    @Test
    public void crearJugador(){
        Equipo equipo = new Equipo("Argentina");
        Jugador jugador1 = new Jugador(34277638,"Rodrigo","de Paul","MED",equipo,Tipo.JUGADOR);
        Jugador jugador2 = new Jugador(34277638,"Carlos","Tevez","DEL",equipo,Tipo.JUGADOR);

        Assert.assertNotNull(jugador1);
        Assert.assertNotNull(jugador2);
    }
}
