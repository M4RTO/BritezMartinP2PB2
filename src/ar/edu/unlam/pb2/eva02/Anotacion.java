package ar.edu.unlam.pb2.eva02;

public class Anotacion {

    private Integer numeroPartido;
    private Integer numeroCamiseta;
    private Lado lado;

    public Anotacion(Integer numeroPartido, Integer numeroCamiseta, Lado lado) {
        this.numeroPartido = numeroPartido;
        this.numeroCamiseta = numeroCamiseta;
        this.lado = lado;
    }

    public Integer getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(Integer numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(Integer numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Lado getLado() {
        return lado;
    }

    public void setLado(Lado lado) {
        this.lado = lado;
    }
}
