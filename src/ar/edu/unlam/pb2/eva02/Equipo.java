package ar.edu.unlam.pb2.eva02;

import java.util.List;

public class Equipo {

    private String nombre;
    private Lado lado;
    private List<Persona> jugadores;

    public Equipo(String nombre, Lado lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }

    public Lado getLado() {
        return lado;
    }

    public void setLado(Lado lado) {
        this.lado = lado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Persona> jugadores) {
        this.jugadores = jugadores;
    }
}
