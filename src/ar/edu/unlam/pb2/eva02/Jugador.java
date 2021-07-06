package ar.edu.unlam.pb2.eva02;

public class Jugador extends Persona {

    private String posicion;
    private Tipo tipo;

    public Jugador(Integer dni, String nombre, String apellido, String posicion, Equipo equipo, Tipo tipo) {
        super(dni, nombre, apellido, equipo);
        this.posicion = posicion;
        this.tipo = tipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
