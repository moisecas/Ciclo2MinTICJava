package banco;

public class Nomina extends Cuenta{
    private String empresa;
    private double tarifa;
    private int numeroRetiros;

    public Nomina(String id, String nombre, double saldo, String password, String empresa, double tarifa, int numeroRetiros) {
        super(id, nombre, saldo, password); //lo que viene en la clase padre Cuenta
        this.empresa = empresa; //son los atributos de la clase hija
        this.tarifa = tarifa;
        this.numeroRetiros = numeroRetiros;
    }

   //get y set
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public int getNumeroRetiros() {
        return numeroRetiros;
    }
    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }
    @Override //sobreescribir el metodo de la clase padre
    public void realizarTransferencia(double cantidad){ //actualizar el saldo de la clase padre Cuenta
        if(this.numeroRetiros > 0){
            this.setSaldo( //set saldo es el metodo de la clase padre Cuenta, set me permite modificar 
                    this.getSaldo() - cantidad - this.tarifa //getsaldo es el metodo para obtener el valor de la variable saldo de la clase padre Cuenta
            );
            this.numeroRetiros--;
        }
    }
    

    
}
