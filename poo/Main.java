package poo;

public class Main {
    public static void main(String[]args) {
        //empiezo a traer de persona el atributo nombre y edad y la funcion mostrarDatos 
        Persona persona1; //instancia de la clase persona
        persona1 = new Persona(); //asigna el valor de null a la variable persona1
        persona1.nombre = "Juan"; //asigna el valor de Juan a la variable nombre de la clase persona
        persona1.edad = 20; //asigna el valor de 20 a la variable edad de la clase persona
        persona1.mostrarDatos(); //llama al metodo mostrarDatos de la clase persona

        Persona persona2 = new Persona(); //instancia de la clase persona
        persona2.nombre = "Pedro"; //asigna el valor de Pedro a la variable nombre de la clase persona
        persona2.edad = 30; //asigna el valor de 30 a la variable edad de la clase persona
        persona2.mostrarDatos(); //llama al metodo mostrarDatos de la clase persona 
    }
}
