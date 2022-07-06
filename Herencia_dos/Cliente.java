package Herencia_dos;

import java.sql.Date;

public class Cliente extends Persona{ //subclase cliente heredando de a clase persona 
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    //constructor

    public Cliente(Date fechaRegistro, Boolean vip, String nombre, String genero, int edad, 
    String direccion) {
        super(nombre, genero, edad, direccion); //llamo al constructor de la clase padre, super es para que llame al constructor de la clase padre
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    //get y set
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

   

    //set fecha
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    //to string use string builder
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente= ").append(idCliente).append(", fechaRegistro= ").append(fechaRegistro).append(", vip= ").append(vip).append("}");
        
        
        return sb.toString();
    }

    
}
