package fibonnaci;

public class fibonacci3 {
    public static void main(String[] args) { //string[] args es un array de strings, es un array de strings que contiene los argumentos que se pasan al programa
        int n = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.println("Ingrese un numero: ");
        n = Integer.parseInt(System.console().readLine()); //n es el numero de elementos del array fibonnaci
        while (n > 0) { //mientras n sea mayor a 0, se ejecuta el ciclo while
            n3 = n1 + n2; //n3 es la suma de n1 y n2
            System.out.println(n3); //muestra el numero de la posicion i del array fibonnaci
            n1 = n2; //n1 es igual a n2 para que n1 sea el numero de la posicion i-1 del array fibonnaci
            n2 = n3; //n2 es igual a n3 para que n2 sea el numero de la posicion i del array fibonnaci
            n--; // n-- para que n sea el numero de la posicion i+1 del array fibonnaci
        }
    }
}
