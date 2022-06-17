/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3ciclo2;

/**
 *
 * @author moise
 */

import java.util.Vector;
public class ClaseVector {
    
    public static void main(String[] args) {
        Vector miVector = new Vector(); //lo agrego o imporo con ctrl + barra espaciadora
        
        miVector.addElement(2); //addElement para los vectores
        miVector.addElement("Texto"); 
        
        for(Object imprimir : miVector){
            System.out.println("el elemento es ::" + imprimir);
        }
    }
    
}
