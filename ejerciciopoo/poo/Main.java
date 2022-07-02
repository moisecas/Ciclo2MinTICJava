package ejerciciopoo.poo;

import ejerciciopoo.clases.Persona; //traemos de otro paquete la clase persona
import ejerciciopoo.clases.Calculadora; //traemos de otro paquete la clase calculadora
import ejerciciopoo.clases.Rectangulos; //traemos de otro paquete la clase calculadora

public class Main {
    public static void main(String[] args) { 
        Persona persona1 = new Persona(); //instancia de la clase persona, creamos un objeto de la clase persona(persona1)
        Persona persona2 = new Persona(); //instancia de la clase persona, creamos un objeto de la clase persona(persona2)
        Persona persona3 = new Persona(); //instancia de la clase persona, creamos un objeto de la clase persona(persona3)
        
        persona1.nombre = "Juan"; //asigna el valor de Juan a la variable nombre de la clase persona
        persona1.edad = 20; //asigna el valor de 20 a la variable edad de la clase persona
        persona1.mostrarDatos(); //llama al metodo mostrarDatos de la clase persona

        persona2.nombre = "Pedro"; //asigna el valor de Pedro a la variable nombre de la clase persona
        persona2.edad = 30; //asigna el valor de 30 a la variable edad de la clase persona
        persona2.mostrarDatos(); //llama al metodo mostrarDatos de la clase persona

        persona3.nombre = "Maria"; //asigna el valor de Maria a la variable nombre de la clase persona
        persona3.edad = 40; //asigna el valor de 40 a la variable edad de la clase persona
        persona3.mostrarDatos(); //llama al metodo mostrarDatos de la clase persona

        Persona persona4 = new Persona(); //instancia de la clase persona, creamos un objeto de la clase persona(persona4)
        persona4.nombre = "Juan"; //asigna el valor de Juan a la variable nombre de la clase persona
        persona4.mostrarDatos();

        Persona persona5 = new Persona("moiso"); //instancia de la clase persona, creamos un objeto de la clase persona(persona5)
        //cuando le paso el valor como argumento se va a ejecutar el contructor que recibe el parametro nombre, ejecución del segundo constructor de la clase persona
  
        //trayendo de otro paquete la clase calculadora y el atributo pi
        System.out.println(Calculadora.PI); //muestra el valor de pi de la clase calculadora
        //Calculadora.PI = 3.16; //asigna el valor de 3.16 a la variable pi de la clase calculadora, no lo puedo hacer porque es un atributo final en la clase calculadora
        //System.out.println(Calculadora.PI); //reimpresion del valor en caso de que se pudiera modificar el atributo pi de la clase calculadora
        System.out.println(Calculadora.sumar(1, 2)); //muestra el valor de la suma de 1 y 2 de la clase calculadora

        //clase calculadora
        Calculadora calcular = new Calculadora(); //instancia de la clase calculadora, creamos un objeto de la clase calculadora(calculadora)
        System.out.println(calcular.resta(50, 30)); //usa resta int
        System.out.println(calcular.resta(50.8, 32.4)); //usa resta double     

        Rectangulos rectangulo1 = new Rectangulos(); //instancia de la clase rectangulos, creamos un objeto de la clase rectangulos(rectangulo1)
        System.out.println(rectangulo1.area(10, 20)); //usa area int de la clase rectangulos 
        
    }
    
}
