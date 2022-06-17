/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3ciclo2;

import java.util.ArrayList;

/**
 *
 * @author moise
 */
public class ClaseArray {
    
    public static void main(String[] args) {
        ArrayList <String> personas = new ArrayList<>(); //<tipodedato>
        
        personas.add("Valentina"); //add para los arrays
        personas.add("Moisés"); //agrego
        personas.add(1,"David"); //estoy diciendo que david va en posición uno y desplazo a moisés de la posición 
        
        //itero con for
        for (String persona : personas) { //mismo tipo de dato con el que declare en el public
            System.out.println(" valor: :" + persona);
            
        }
        
        
    }
    
}
