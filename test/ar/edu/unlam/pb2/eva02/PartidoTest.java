package ar.edu.unlam.pb2.eva02;

import org.junit.Assert;
import org.junit.Test;

public class PartidoTest {

    @Test
    public void crearPartido(){
        Equipo equipoVisitante = new Equipo("Argentina");
        Equipo equipoLocal = new Equipo("Brasil");

        Partido partido = new Partido("Partido-1",equipoVisitante,equipoLocal);

        Assert.assertNotNull(partido);
    }
}
