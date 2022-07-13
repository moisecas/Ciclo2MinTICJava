package Reto4;

public class Corredor {
    //atributos privados nombreCompleto string, numeroIdenticador string, estatura double, edad int, tiempoMeta double
    private String nombreCompleto;
    private String numeroIdenticador;
    private double estatura;
    private int edad;
    private double tiempoMeta;

    //constructor
    public Corredor(String nombreCompleto, String numeroIdenticador, double estatura, int edad, double tiempoMeta) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdenticador = numeroIdenticador;
        this.estatura = estatura;
        this.edad = edad;
        this.tiempoMeta = tiempoMeta;
    }

    //get y set
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getNumeroIdenticador() {
        return numeroIdenticador;
    }
    public void setNumeroIdenticador(String numeroIdenticador) {
        this.numeroIdenticador = numeroIdenticador;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getTiempoMeta() {
        return tiempoMeta;
    }
    public void setTiempoMeta(double tiempoMeta) {
        this.tiempoMeta = tiempoMeta;
    }

    

}
