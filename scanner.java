import java.util.Scanner; //importar clase Scanner

public class scanner {
    //funcion main
    public static void main(String[] args) {
        System.out.println("ingrese su nombre: ");
        Scanner consola = new Scanner(System.in); //crear objeto de la clase Scanner, nombre de variable consola y asignarle el valor de la entrada de datos
        
        var usuario = consola.nextLine(); //crear variable usuario y asignarle el valor de la entrada de datos
        System.out.println("usuario = " + usuario); //imprimir usuario
        System.out.println("ingrese su edad: ");
        var edad = Integer.parseInt(consola.nextLine()); //crear variable edad y asignarle el valor de la entrada de datos convertido a entero
        System.out.println("edad = " + (edad + 1)); //imprimir edad
        //nombre y edad
        System.out.println("nombre y edad: " + usuario + " " + edad); //imprimir concatenación de cadenas
      
       
    }
    
}
