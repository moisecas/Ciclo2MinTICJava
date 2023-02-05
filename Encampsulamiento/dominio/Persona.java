package Encampsulamiento.dominio;

public class Persona {
    //atributos private 
    private String nombre;
    private double sueldo;
    private boolean eliminado; //para saber si el registro está eliminado o no

    //constructor vacio
    public Persona(String nombre, double sueldo, boolean eliminado) { //variables locales
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }   

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { //is para boolean 
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String toString() { //sobreescribir el método toString para imprimir los atributos
        return "Persona{" + "nombre=" + this.nombre + ", sueldo=" + this.sueldo + ", eliminado=" + this.eliminado + '}';
    }
    

}
