import java.util.Random;
import java.util.Scanner;

public class FuncionesJava {
    public static void main(String args[]) {
        //imprimirMensajes();

        //String usuario = "Juan Perez";
        //imprimirNombreUsuario(usuario);
        
       //int valorAleatorio = obtenerNumeroAleatorio();
        //System.out.println("El número aleatorio entre 1 y 10 es: " + valorAleatorio);

        System.out.println("Ingrese 3 números para calcular el promedio simple:");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        double numero3 = sc.nextDouble();
        System.out.println("El promedio simple de los números ingresados es: " + generarPromedioSimpleTresNumeros(numero1, numero2, numero3));
        sc.close();

    }

    //EJEMPLO DE FUNCIÓN SIN PARÁMETROS NI RETORNO.
    //Escriba una función que imprima 3 mensajes (de su preferencia) por consola.

    public static void imprimirMensajes(){
        System.out.println("Bienvenido, esta es una función sin retorno.");
        System.out.println("Además, es una función sin parámetros.");
        System.out.println("Adios.");
    }

    protected static void imprimirNombreUsuario(String nombre){
        System.out.println("Bienvenido al sistema: " + nombre);
    }

    private static int obtenerNumeroAleatorio(){
        int min = 1;
		int max = 10;
		Random validador = new Random();
		int value = validador.nextInt(max) + min;
		return(value);
    }

    public static double generarPromedioSimpleTresNumeros(double num1, double num2, double num3){
        return((num1 + num2 + num3)/3);
    }

}
