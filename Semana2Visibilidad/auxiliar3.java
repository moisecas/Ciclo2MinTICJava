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
    Usaremos esta clase auxiliar para ejemplificar como se acceder a variables 
    privadas a través de metodos Get y Set publicos.
 */

public class auxiliar3 {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Privadas
        privadas objPri = new privadas();

        // Obtenemos el valor que tiene nombre en este momento, a través del Get
        System.out.println(" " + objPri.getNombreVar());

        // Renobramos el valor del nombre a través del metodo Set
        System.out.println("" + objPri.setNombreVar(" Hola mundo"));

    }

}
