package arrays;

public class foreach {
    public static void main(String[] args) {
        String nombres [] = {"Juan", "Pedro", "Maria", "Luis", "Juan"}; // Declaramos un array de tipo String
        for (String nombre : nombres) { // Recorremos el array, declaramos el tipo de variable que va a recorrer el array
            System.out.println(nombre); // Imprimimos el valor de cada elemento del array recuperados en nombre
        }

    }
}
