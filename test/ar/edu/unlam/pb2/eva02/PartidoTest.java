package ar.edu.unlam.pb2.eva02;

import org.junit.Assert;
import org.junit.Test;

public class PartidoTest {

    @Test
    public void crearPartido(){
        Partido partido = new Partido();
        String nombreEquipoLocal = "Argentina";
        String nombreEquipoVisitante = "Brasil";
        partido.crearPartido(nombreEquipoLocal,nombreEquipoVisitante);

        Assert.assertNotNull(partido);
    }
}
