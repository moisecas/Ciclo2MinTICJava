package herencia.Domain;

public class Empleado extends Persona{ //herencia de la clase Persona
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //variable de clase

    public Empleado(String nombre, double sueldo) { //constructor con argumentos
        super(nombre); //llamamos al constructor de la clase padre
        this.idEmpleado = ++Empleado.contadorEmpleados; //incrementamos el idEmpleado
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public static void setContadorEmpleados(int contadorEmpleados) {
        Empleado.contadorEmpleados = contadorEmpleados;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

}