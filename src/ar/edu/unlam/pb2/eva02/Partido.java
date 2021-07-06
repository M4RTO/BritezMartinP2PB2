package ar.edu.unlam.pb2.eva02;

public class Partido {

    private String nombre;
    private Equipo equipoVisitante;
    private Equipo equipoLocal;

    public Partido(String nombre, Equipo equipoVisitante, Equipo equipoLocal) {
        this.nombre = nombre;
        this.equipoVisitante = equipoVisitante;
        this.equipoLocal = equipoLocal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
}
