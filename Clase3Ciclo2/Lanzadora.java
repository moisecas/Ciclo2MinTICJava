/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3ciclo2;

/**
 *
 * @author moise
 */
public class Lanzadora { //importación de variables
    
    public static void main (String[]args){ //public palabra reservada de visibilidad
        System.out.println("Paso primero");
        
        Prueba miObjeto = new Prueba();
        miObjeto.suma();  //acá estoy importando las clases del proyecto, estructura, el metodo suma esta en prueba 
    }
    
}
