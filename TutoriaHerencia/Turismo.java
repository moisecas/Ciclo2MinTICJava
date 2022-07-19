package TutoriaHerencia;

public class Turismo extends Vehiculo { //extiende de Vehiculo herencia
    int puertas;
    boolean cajaAutomatica;

    //constructor 
    public Turismo(String marca, String modelo, int matricula, String color, double tarifa, boolean disponible, int puertas, boolean cajaAutomatica) {
        super(marca, modelo, matricula, color, tarifa, disponible);
        this.puertas = puertas;
        this.cajaAutomatica = cajaAutomatica;
    }

    String getAtributos() {
        return super.getAtributosString() + "\nPuertas: " + puertas + "\nCaja Automatica: " + cajaAutomatica;
    }
}
