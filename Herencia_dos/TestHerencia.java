package Herencia_dos;

import Herencia_dos.*; //importamos todo

public class TestHerencia {
    //main
    public static void main(String[] args) {
        // TODO code application logic here
        //objeto de la clase persona      
        
        Persona persona = new Persona("moises","M",25,"san francisco"); //instancio el objeto persona, como persona no tiene constructor no me recibe nada
        System.out.println(persona); //llamo al metodo getNombre de la clase persona, get nombre tiene toda la logica

        //objeto de la clase empleado
        Empleado empleado = new Empleado(3000,"moises"); //instancio el objeto empleado, como empleado no tiene constructor no me recibe nada
        System.out.println(empleado); //llamo al metodo getNombre de la clase empleado, get nombre tiene toda la logica
    }
}
