package ar.edu.unlam.pb2.eva02;

import java.util.Objects;

public class Partido {

    private Integer id;
    private String nombre;
    private Equipo equipoVisitante;
    private Equipo equipoLocal;

    public Partido(String nombre, Equipo equipoVisitante, Equipo equipoLocal) {
        this.id = hashCode();
        this.nombre = nombre;
        this.equipoVisitante = equipoVisitante;
        this.equipoLocal = equipoLocal;
    }

    public Partido() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partido partido = (Partido) o;
        return Objects.equals(nombre, partido.nombre) && Objects.equals(equipoVisitante, partido.equipoVisitante) && Objects.equals(equipoLocal, partido.equipoLocal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, equipoVisitante, equipoLocal);
    }

    public void crearPartido(String nombreEquipoLocal, String nombreEquipoVisitante) {
        Equipo equipoLocal = new Equipo(nombreEquipoLocal, Lado.LOCAL);
        Equipo equipoVisitante = new Equipo(nombreEquipoVisitante, Lado.VISITANTE);
        new Partido("partido-".concat(String.valueOf(hashCode())),equipoVisitante,equipoLocal);
    }
}
