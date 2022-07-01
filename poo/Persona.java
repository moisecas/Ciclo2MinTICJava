package poo;


//para ejecutar todo lo de la clase persona debemos instanciar en main.java, acá no podremos usar la clase persona pues no tengo main
public class Persona { //clase para crear personas
    String nombre; //atributo nombre
    int edad; //atributo edad

    //metodo de la clase, para mostrar los datos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre); //muestra el nombre
        System.out.println("Edad: " + edad); //muestra la edad
    }
}
