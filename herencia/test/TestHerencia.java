package herencia.test;
import herencia.Domain.Empleado;
import herencia.Domain.Cliente;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000); //creamos un objeto de tipo Empleado
        System.out.println("empleado1 = " + empleado1); //imprime la referencia de memoria

        Cliente cliente1 = new Cliente(new java.util.Date(), true, "Karla"); //creamos un objeto de tipo Cliente
        System.out.println("cliente1 = " + cliente1); //imprime la referencia de memoria

    }
}