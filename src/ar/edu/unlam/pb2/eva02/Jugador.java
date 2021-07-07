package ar.edu.unlam.pb2.eva02;

public class Jugador extends Persona {

    private String posicion;
    private Integer numeroCamiseta;

    public Jugador(Integer dni, String nombre, String apellido, Equipo equipo, Tipo tipo, String posicion, Integer numeroCamiseta) {
        super(dni, nombre, apellido, equipo, tipo);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(Integer numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
