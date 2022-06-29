package Tutoria2;

import java.util.ArrayList; //importacion de la clase ArrayList por la creación de un array de tipo ArrayList<Integer>

import java.util.Scanner; //importacion de la clase Scanner por el uso de la entrada de datos

import java.util.Collections; //


 class MyClass {
    public static void main(String args[]) { //clase static porque no se necesita instanciarla para usarla 
      System.out.println(Class.arrayListOfIntegers() + " es el ArrayList devuelto por el método."); //imprime el ArrayList devuelto por el método arrayListOfIntegers()
      
      System.out.println(Class.arrayListOfIntegers().size() + " elementos tiene la lista.");
      
      Integer sum = 0;
      for (Integer number: Class.arrayListOfIntegers()) { //for each para recorrer el array y sumar los elementos
          //System.out.print(number + ", ");
          sum += number;
      }
      System.out.println("Los elementos de la lista suman: " + sum);
      
      Integer minimal = Collections.min(Class.arrayListOfIntegers()); //minimal es el elemento mínimo de la lista
      System.out.println(minimal + " es el mínimo valor en la lista.");
      
      Integer maximal = Collections.max(Class.arrayListOfIntegers()); //maximal es el elemento máximo de la lista
      System.out.println("El máximo valor en la lista es " + maximal);
          
      System.out.println(Class.arrayListOfIntegers().get(0) + " tiene el índice 0.");
    }
}

class Class {
    static Scanner scanner = new Scanner(System.in);
    
    public static ArrayList<Integer> arrayListOfIntegers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-10); //add agrega un elemento al array con add(elemento) y -10 es el elemento a agregar al array
        numbers.set(0, 10);
        numbers.add(25);
        numbers.add(-100);
        
        /*
        // read an integer from the keyboard
        System.out.print("Ingrese un nuevo elemento en la lista: ");
        Integer readedNumber = scanner.nextInt();
        numbers.add(readedNumber);
        */
        
        return(numbers);//retorna el array numbers con todos los elementos agregados anteriormente en el método arrayListOfIntegers() y el método arrayListOfIntegers() devuelve un ArrayList<Integer>
    }
}


