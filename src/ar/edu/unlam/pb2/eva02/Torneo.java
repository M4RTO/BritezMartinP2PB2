package ar.edu.unlam.pb2.eva02;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Torneo {

    private String nombre;
    private HashSet<Partido> partidos;
    private List<Jugador> jugadores;
    private Map<Integer,Anotacion> anotaciones;

    public Torneo(String nombre, HashSet<Partido> partidos, List<Jugador> jugadores, Map<Integer, Anotacion> anotaciones) {
        this.nombre = nombre;
        this.partidos = partidos;
        this.jugadores = jugadores;
        this.anotaciones = anotaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Map<Integer, Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(Map<Integer, Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }
}
