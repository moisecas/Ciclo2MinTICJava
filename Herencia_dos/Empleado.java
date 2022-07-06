package Herencia_dos;

public class Empleado extends Persona { //clase hija empleado, hereda de la clase persona padre
    //colocamos distinto o lo que falta, lo que no esta en la clase padre (Persona)
    private int idEmpleado; //private es para que sea visible solo en la clase hija
    private double sueldo; //private es para que sea visible solo en la clase hija
    private static int contadorEmpleado; //static es para que sea visible solo en la clase hija

    //constructor
    public Empleado(double sueldo, String nombre) { //vacio 
        super(nombre); //llamo al constructor de la clase padre, super es para que llame al constructor de la clase padre
        this.idEmpleado = ++Empleado.contadorEmpleado; //aumento el contadorEmpleado
        this.sueldo = sueldo; //asigno el sueldo
    }
    //get y set 

    public int getIdEmpleado() {
        return idEmpleado;
    }

    

    public double getSueldo() {
        return sueldo;
    }

  

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //to string use string builder 
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado= ").append(this.idEmpleado);
        sb.append(", sueldo= ").append(this.sueldo);
        sb.append(",  ").append(super.toString()); //llamo al toString de la clase padre
        sb.append("}"); //cierro el string builder
        return sb.toString();
    }
}
