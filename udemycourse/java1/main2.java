package java1;

public class main2 {
    //metodo main
    public static void main(String[] args) {
        int numero = 10; //alcance de la variable numero es solo dentro del metodo main
        System.out.println("El numero es " + numero); //imprime "El numero es 10"

        //modificamos el valor de la variable 
        numero = 5; //asigna 5 a numero 
        System.out.println("El numero es " + numero); //imprime "El numero es 5"

        String nombre = "Juan"; //alcance de la variable nombre es solo dentro del metodo main
        System.out.println("Hola " + nombre); //imprime "Hola Juan"
        nombre = "adios"; //asigna "adios" a nombre 
        System.out.println(nombre); //imprime "Hola adios"

    }
}
