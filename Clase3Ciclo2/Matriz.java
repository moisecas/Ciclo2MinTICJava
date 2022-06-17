/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3ciclo2;

/**
 *
 * @author moise
 */
public class Matriz {
    
    public static void main(String[]args){
    
        double[] notas; //array lineal1x1, double tipo numerico, declarar
        
        notas = new double [5]; //inicialización, 5 espacios
        notas[0] = 3.1; //uso, notas posición
        notas[1] = 2.2;
        notas[2] = 1.1;
        notas[3] = 4.1;
        notas[4] = 4.8;
        
        
        //imprimir matriz con un for, con el foreach
        for (int i = 0; i <= notas.length-1; i++) { //objeto de tipo double, recorre, va el -1, posiciones e indices arrancan en 0
            System.out.println("la nota es mi objeto::" + notas[i]);//notas[i], i es lo que va iterando por la posición 
        }
    }
    
}
