package banco;

public class Banco {
    //main
    public static void main(String[] args) {
        //instanciar cuenta, objeto de la clase Cuenta
        Cuenta cuenta = new Cuenta("12345", "Juan", 1000, "123");
        //imprimir cuenta
        System.out.println("Cuenta: " + cuenta.getId() + " " + cuenta.getNombre() + " " + cuenta.getSaldo() + " " + cuenta.getPassword());
        //corte de cuenta
        cuenta.setSaldo(cuenta.calcularcorte());
        //imprimir cuenta
        System.out.println("Cuenta: " + cuenta.getId() + " " + cuenta.getNombre() + " " + cuenta.getSaldo() + " " + cuenta.getPassword());
    
        //instanciar cuenta, objeto de la clase Cuenta
        Ahorros ahorros = new Ahorros("12345", "Juan", 1000, "123", 0.1);
    }
}
