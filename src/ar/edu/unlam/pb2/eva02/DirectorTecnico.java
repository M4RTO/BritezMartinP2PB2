package ar.edu.unlam.pb2.eva02;

public class DirectorTecnico extends Persona {

    private Tipo tipo;

    public DirectorTecnico(Integer dni, String nombre, String apellido, Equipo equipo) {
        super(dni, nombre, apellido, equipo);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
