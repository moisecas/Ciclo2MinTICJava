package banco;

public class Corriente extends Cuenta {
    private int numCheques; 
    private double cuota; 

    //constructor
    public Corriente(String id, String nombre, double saldo, String password, int numCheques, double cuota) { //informacion de la clase padre Cueta
        super(id, nombre, saldo, password); //super se usa para llamar a la clase padre
        this.numCheques = numCheques; //declaracion de la variable de la clase hija
        this.cuota = cuota; //declaracion de la variable de la clase hija
    }
    @Override //sobreescribir el metodo de la clase padre
    public void realizarTransferencia(double cantidad){ //actualizar el saldo de la clase padre Cuenta
        if(this.numCheques > 0){
            this.setSaldo( //set saldo es el metodo de la clase padre Cuenta, set me permite modificar 
                    this.getSaldo() - cantidad - cantidad*(1-this.cuota) 
            );
            this.numCheques--;
        }
    }
    @Override //sobreescribir el metodo de la clase padre, polimorfismo de metodos 
    public void realizarConsignacion(double cantidad){ //actualizar el saldo de la clase padre Cuenta
        this.setSaldo( //set saldo es el metodo de la clase padre Cuenta, set me permite modificar 
                this.getSaldo() + cantidad
        );
    }
    //polimorfismo: código generico que se puede usar en diferentes clases con logica diferente
    
}
