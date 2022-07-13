package banco;

//cuenta es la clase padre 
public class Cuenta {
    private String id;
    private String nombre;
    private double saldo; 
    private String password;

    //constructor
    public Cuenta(String id, String nombre, double saldo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.password = password;
    }

    //get y set
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double calcularcorte() {
        return this.saldo * 0.1;
    }
    public void realizarTransferencia(double cantidad){
        this.saldo = this.saldo - cantidad;

    }
    public void realizarDeposito(double cantidad){
        this.saldo = this.saldo + cantidad;

    }
    public void realizarConsignacion(double cantidad){
        this.saldo = this.saldo + cantidad;

    }
}
