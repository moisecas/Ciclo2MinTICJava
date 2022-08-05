package banco2;

public class banco {
    //main
    public static void main(String[] args) {
        //instanciar cliente, objeto de la clase cliente 
        cliente cliente = new cliente("Juan", "123456789", 1000, "123");
        //imprimir cliente
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getNumeroIdentificacion() + " " + cliente.getSaldo() + " " + cliente.getPassword());
      //instanciar empresa, objeto de la clase empresa 
        empresa empresa = new empresa("Banco", "123456789", 1000, "123");
        //imprimir empresa
        System.out.println("Empresa: " + empresa.getNombre() + " " + empresa.getNumeroIdentificacion() + " " + empresa.getSaldo() + " " + empresa.getPassword());
        //instanciar banco, objeto de la clase banco 
        
    }
}
