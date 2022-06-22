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
        La palabra reservada protected nos da la posibilidad de usar similar a 
        public con la diferencia que no es abierta para todos, solo a nivel de 
        clase, paquete, subclase, no el mundo, es decir para librerias no.
 */
public class protegido {

    // Declaramos la variable con visibilidad protected
    protected String nombreProtegido = "Carlos Protegido";
    // Declaramos la variable con visibilidad protected y ademas estatica
    protected static String apellidoProtegido = "Romero Protegido";

    public static void main(String[] args) {

        // uso de variable tipo estatica a nivel de clase
        System.out.println(" " + apellidoProtegido);

        // creación de objeto para acceder a variables no estaticas
        protegido obj = new protegido();
        // Uso de variable a través del objeto.
        System.out.println(" " + obj.nombreProtegido);
    }

}
