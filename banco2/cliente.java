package banco2;

public class cliente {
    //atributos, nombre, numero de identificacion, saldo, password
    String nombre;
    String numeroIdentificacion;
    double saldo;
    String password;

    //constructor
    public cliente(String nombre, String numeroIdentificacion, double saldo, String password) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.saldo = saldo;
        this.password = password;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
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

    //metodo solicita acceso para deposito
    public void deposito(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }
    //metodo retiro para realizar retiro en la cuenta
    public void retiro(double cantidad) {
        this.saldo = this.saldo - cantidad;
    }

    //cosultar saldo de la cuenta
    public double consultarSaldo() {
        return this.saldo;
    }

}
