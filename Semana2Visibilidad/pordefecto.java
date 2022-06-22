/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana2.ejercicio;

/**
 *
 * @author moise
 */



/*
    Este nivel de visibilidad se asemeja a un public, pero no es accesible a nivel
    de subclase en diferentes paquetes.
    
 */
public class pordefecto {

    String nombre = "Carlos por defecto";
    static String apellido = "Romero por defecto";

    public static void main(String[] args) {
//Uso de variable dentro de la misma clase
        System.out.println(" " + apellido);
    }

    public class subClase {
// Uso de variable en sub clase mismo paquete, permitido

        public void main(String[] args) {
            System.out.println("" + apellido);
        }

    }

}
