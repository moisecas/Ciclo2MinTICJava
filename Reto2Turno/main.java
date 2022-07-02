package Reto2Turno;

import java.util.Arrays;

public class main {
    //variables
    private String [] turnos;
    private String [] turnosPerdidos;
    private boolean estadoTurnoVirtual = true; //true = turno virtual, false = turno real
    private int turnoEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1;

    //contructor
    public main (String [] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length];
        for (int i = 0; i < turnos.length; i++) {
            this.turnosPerdidos[i] = "";
        }
    }

    //creamos setters y getters para los atributos
    public void setTurnos(String [] turnos) {
        this.turnos = turnos;
    }
    public String [] getTurnos() {
        return this.turnos; //retorna el valor de la variable turnos
    }

    public void setTurnosPerdidos(String [] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }
    public String [] getTurnosPerdidos() {
        return this.turnosPerdidos; //retorna el valor de la variable turnosPerdidos
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public boolean getEstadoTurnoVirtual() {
        return this.estadoTurnoVirtual; //retorna el valor de la variable estadoTurnoVirtual
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getTurnoEnAtencion() {
        return this.turnoEnAtencion; //retorna el valor de la variable turnoEnAtencion
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    public int getCantidadTurnosAtendidos() {
        return this.cantidadTurnosAtendidos; //retorna el valor de la variable cantidadTurnosAtendidos
    }


    //metodos public void, no retornan nada 

    public void atenderProximoTurno() {
        if (estadoTurnoVirtual==true) { //si el turno virtual esta activo (true) se atiende el turno virtual
            turnoEnAtencion++;
            cantidadTurnosAtendidos++; //aumenta la cantidad de turnos atendidos
        } 
    }

    public void cambiarEstadoTurno(){
        if (estadoTurnoVirtual) { //si el turno virtual esta activo (true) se cambia a false
            estadoTurnoVirtual = false;
        } else { //si el turno virtual esta desactivado (false) se cambia a true
            estadoTurnoVirtual = true;
        }
    }

    public void mostrar(){
        System.out.println(Arrays.toString(turnosPerdidos));
    }
}
