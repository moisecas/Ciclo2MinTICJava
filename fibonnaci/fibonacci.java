package fibonnaci;

public class fibonacci {
    //metodo main solución 2 de fibonnaci 
    public static void main(String[] args) {  //metodo main que hace fibonnaci y muestra el resultado por consola
        int n = 0; //n es el numero de elementos del array fibonnaci
        int n1 = 0; //n1 es el numero de elementos del array fibonnaci
        int n2 = 1; //n2 es el numero de elementos del array fibonnaci
        int n3 = 0; //n3 es el numero de elementos del array fibonnaci
        System.out.println("Ingrese un numero: "); //pregunta al usuario por un numero
        n = Integer.parseInt(System.console().readLine()); //lee el numero ingresado por el usuario y lo convierte a entero
        while (n > 0) { //ciclo while para recorrer el array fibonnaci, n es el indice del array fibonnaci, la posición que ocupa en el array
            n3 = n1 + n2;  //n3 es la suma de n1 y n2
            System.out.println(n3); //muestra el numero de la posicion i del array fibonnaci
            n1 = n2; //n1 es igual a n2 para que n1 sea el numero de la posicion i-1 del array fibonnaci
            n2 = n3; //n2 es igual a n3 para que n2 sea el numero de la posicion i del array fibonnaci
            n--; //n es igual a n-1 para que n sea el numero de la posicion i+1 del array fibonnaci
        }
    }

}
