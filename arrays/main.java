package arrays;

public class main {
    public static void main(String[] args) {
        String nombres []; // Declaramos un array de tipo String
        nombres = new String[5]; // Inicializamos el array con 5 elementos
        nombres[0] = "Juan"; // Asignamos un valor a cada elemento del array
        nombres[1] = "Pedro";
        nombres[2] = "Maria"; // Asignamos un valor a cada elemento del array 
        nombres[3] = "Luis"; // Asignamos un valor a cada elemento del array
        nombres[4] = "Juan"; // solo puedo asignar hasta el tamaño que asigne el array -> 5 elementos
        System.out.println(nombres[0]); // Imprimimos el valor de cada elemento del array
        nombres[0] = "moises"; // reasignamos el valor  
        //tamaño del array 
        System.out.println(nombres.length); // Imprimimos el tamaño del array
        int array1 [] = {1,2,3,4,5}; // Declaramos un array de tipo entero
        System.out.println(array1[0]); // Imprimimos el valor de cada elemento del array
        array1[0] = 10; // reasignamos el valor
        //tamaño
        System.out.println(array1.length); // Imprimimos el tamaño del array
    }
    
}
