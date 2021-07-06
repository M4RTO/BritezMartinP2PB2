package ar.edu.unlam.pb2.eva02;

public abstract class Persona {
    private Integer dni;
    private String nombre;
    private String apellido;
    private Equipo equipo;

    public Persona(Integer dni, String nombre, String apellido,Equipo equipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.equipo = equipo;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
