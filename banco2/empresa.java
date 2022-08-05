package banco2;

public class empresa {
    //atributos, nombre, numero de identificacion, saldo, password
    private String nombre;
    private String numeroIdentificacion;
    private double saldo;
    private String password;
    //constructor
    public empresa(String nombre, String numeroIdentificacion, double saldo, String password) {
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

    //metodo realizar inversión
    public void inversion(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }
}
