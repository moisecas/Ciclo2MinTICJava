package TutoriaHerencia;

public class Vehiculo { //herencia 
    //atributos
    String marca;
    String modelo;
    int matricula;
    String color;
    double tarifa;
    boolean disponible;

    //constructor
    public Vehiculo(String marca, String modelo, int matricula, String color, double tarifa, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    //metodos
    String getAtributosString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\nColor: " + color + "\nTarifa: " + tarifa + "\nDisponible: " + disponible;
    } 

    void vender() {
        disponible = false;
    }
}
