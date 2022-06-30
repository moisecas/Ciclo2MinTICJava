package demoreto;

public class demo {
    //array de notas
    static int[] notas = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //declaración de un array de notas
    //metodo valor de la nota más alta, promedio y nota más baja
    public static void main(String[] args) { //metodo main de la clase demo que recibe un array de String como argumento
        int notaMasAlta = notas[0]; //notaMasAlta es la nota mas alta del array notas
        int notaMasBaja = notas[0]; //notaMasBaja es la nota mas baja del array notas inicia en la posicion 0
        int sumaNotas = 0; //sumaNotas es la suma de todas las notas del array notas
        for (int i = 0; i < notas.length; i++) { //ciclo for para recorrer el array notas, i es el indice del array notas, la posición que ocupa en el array
            if (notas[i] > notaMasAlta) { //si la nota en la posicion i del array notas es mayor a la nota mas alta
                notaMasAlta = notas[i]; //asigna la nota en la posicion i del array notas a la nota mas alta
            }
            if (notas[i] < notaMasBaja) { //si la nota en la posicion i del array notas es menor a la nota mas baja
                notaMasBaja = notas[i]; //asigna la nota en la posicion i del array notas a la nota mas baja
            }
            sumaNotas += notas[i]; //sumaNotas es la suma de todas las notas del array notas, de las posiciones del array notas
        }
        double promedio = sumaNotas / notas.length; //promedio es la suma de todas las notas del array notas dividida por el numero de elementos del array notas
        
        //mostrar resultado por consola
        System.out.println("La nota mas alta es: " + notaMasAlta);
        System.out.println("La nota mas baja es: " + notaMasBaja);
        System.out.println("El promedio es: " + promedio);
    }
    
}
