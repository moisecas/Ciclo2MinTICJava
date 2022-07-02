package ejerciciopoo.clases; //indicar el package donde estamos trabajando 

public class Persona {
    public String nombre; //atributo nombre, publico para que sea visible desde afuera de la clase
    public int edad; //atributo edad

    //constructor de la clase, para crear una persona
    public Persona() {
        System.out.println("Se creo una persona"); //mensaje de que se creo una persona
        nombre = ""; //asigna el valor de "" a la variable nombre de la clase persona
        edad = 0; //asigna el valor de 0 a la variable edad de la clase persona
    }
    public Persona(String nombre){
        System.out.println("hola" + nombre); //mensaje de que se creo una persona
        
    }

    //metodo de la clase, para mostrar los datos
    public void mostrarDatos(){ //función 
        System.out.println("Nombre: " + nombre); //muestra el nombre
        System.out.println("Edad: " + edad); //muestra la edad
    }
}
