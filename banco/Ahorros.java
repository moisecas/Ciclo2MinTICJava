package banco;

public class Ahorros extends Cuenta {
    private double cuotaManejo;

    //constructor
    public Ahorros(String id, String nombre, double saldo, String password, double cuotaManejo) { //informacion de la clase padre Cueta
        super(id, nombre, saldo, password); //super se usa para llamar a la clase padre
        this.cuotaManejo = cuotaManejo; //declaracion de la variable de la clase hija
    }

    @Override //sobreescribir el metodo de la clase padre
    public double calcularcorte() {
        this.setSaldo( //set saldo es el metodo de la clase padre Cuenta, set me permite modificar 
                this.getSaldo() - this.cuotaManejo //getsaldo es el metodo para obtener el valor de la variable saldo de la clase padre Cuenta
        );
        return this.getSaldo(); //get me devuelve el valor
    } 
    
}
