package Tutoria_3_objetos;

public class pies {

    entrada entrada = new entrada(0.0); //instancio el objeto entrada
    proceso proceso = new proceso(0.0, 0.0); //instancio el objeto proceso, con los parametros 
    salida salida = new salida(); //instancio el objeto salida con new y su constructor

    public void comenzarAccion(){

        entrada.capturar(); //llamo al metodo capturar de la clase entrada, traigo 
        proceso.calcular(entrada.getPies()); //llamo al metodo calcular de la clase proceso, le paso el parametro de entrada.getPies()}
        salida.mostrar(proceso.getYardas(), proceso.getPulgadas()); //llamo al metodo mostrar de la clase salida, le paso los parametros de proceso.getYardas() y proceso.getPulgadas()
    }
    
}

