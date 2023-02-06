package herencia.test;
import herencia.Domain.Empleado;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000); //creamos un objeto de tipo Empleado
        System.out.println("empleado1 = " + empleado1); //imprime la referencia de memoria
    }
}