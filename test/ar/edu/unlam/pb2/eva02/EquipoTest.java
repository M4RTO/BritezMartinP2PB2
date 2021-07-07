package ar.edu.unlam.pb2.eva02;

import org.junit.Assert;
import org.junit.Test;

public class EquipoTest {

    @Test
    public void crearEquipo(){
        Equipo equipo = new Equipo("Argentina",Lado.VISITANTE);
        Assert.assertNotNull(equipo);
    }
}
