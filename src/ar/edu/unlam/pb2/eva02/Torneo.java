package ar.edu.unlam.pb2.eva02;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Torneo {

    private String nombre;
    private HashSet<Partido> partidos;
    private List<Persona> participantes;
    private Map<Integer,Anotacion> anotaciones;

    public Torneo(String nombre, HashSet<Partido> partidos, List<Persona> participantes, Map<Integer, Anotacion> anotaciones) {
        this.nombre = nombre;
        this.partidos = partidos;
        this.participantes = participantes;
        this.anotaciones = anotaciones;
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.partidos = new HashSet<>();
        this.participantes = new ArrayList<>();
        this.anotaciones = new HashMap<>();
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

    public List<Persona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Persona> participantes) {
        this.participantes = participantes;
    }

    public Map<Integer, Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(Map<Integer, Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }

    public void registrarParticipante(Persona participante) {
        this.participantes.add(participante);
    }

    public void registrarPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public void registrarNominaParaElPartido(Partido partido) {

        List<Persona> participantesEquipoLocal = this.participantes
                .stream()
                .filter(participante -> participante.getEquipo().equals(partido.getEquipoLocal()) && participante.getTipo().equals(Tipo.JUGADOR))
                .collect(Collectors.toList());

        List<Persona> participantesEquipoVisitante = this.participantes
                .stream()
                .filter(participante -> participante.getEquipo().equals(partido.getEquipoVisitante()) && participante.getTipo().equals(Tipo.JUGADOR))
                .collect(Collectors.toList());

        partido.getEquipoLocal().setJugadores(participantesEquipoLocal);
        partido.getEquipoVisitante().setJugadores(participantesEquipoVisitante);
    }

    public void registrarGol(Integer idPartido, Integer numeroCamiseta, Lado lado, int minuto) {
        Anotacion anotacion = new Anotacion(idPartido,numeroCamiseta,lado);
        this.anotaciones.put(minuto,anotacion);
    }

}
