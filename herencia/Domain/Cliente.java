package herencia.Domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;

    private static int contadorClientes; //contador de clientes para asignar el idCliente

    //constructor con argumentos
    public Cliente(Date fechaRegistro, boolean vip, String nombre) {
        super(nombre); //llamamos al constructor de la clase padre
        this.idCliente = ++Cliente.contadorClientes; //incrementamos el idCliente y lo asignamos al idCliente para cada cliente
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    //constructor sin argumentos
    public Cliente() {
        this.idCliente = ++Cliente.contadorClientes; //incrementamos el idCliente
    }

    //get y set
    public int getIdCliente() {
        return idCliente;
    }

    // public void setIdCliente(int idCliente) {
    //     this.idCliente = idCliente;
    // }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    public static void setContadorClientes(int contadorClientes) {
        Cliente.contadorClientes = contadorClientes;
    }

    //toString 
    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }

}
