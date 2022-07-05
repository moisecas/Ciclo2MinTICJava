package Tutoria_3_objetos;

import java.util.Scanner;




public class Persona {
    public String nombre;
    public int edad;
    Scanner sc = new Scanner(System.in); //Creo un objeto de tipo Scanner para poder leer desde el teclado, new para instanciarlo y System.in para que sea el teclado por defecto


    //Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo 
    public void mostrar() { //de tipo voy porque no retorna datos 
        //pedir datos por consola
        System.out.println("Ingrese el nombre del alumno" + nombre);
        System.out.println("Ingrese la edad del alumno" + edad);
    }
}
