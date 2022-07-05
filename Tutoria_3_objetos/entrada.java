package Tutoria_3_objetos;

import java.util.Scanner;

public class entrada {
    private double pies;
    Scanner entrada = new Scanner(System.in); //Creo un objeto de tipo Scanner para poder leer desde el teclado, new para instanciarlo y System.in para que sea el teclado por defecto

    //constructor
    public entrada(double pies) {
        this.pies = pies;
    }

    //set y get pies

    public void setPies(double pies) { //hace referencia a la variable pies
        this.pies = pies;
    }

    public double getPies() { //retorna la variable pies 
        return pies;
    }

    //metodo capturar
    public void capturar() {
        System.out.println("Ingrese los pies: "); //pide los pies
        setPies(entrada.nextDouble()); //captura los pies, set es para asignarle un valor a la variable pies, entrada es el scanner que se encarga de capturar los datos por consola
    } //nextDouble es para que el scanner capture un dato de tipo double, se debe especificar por lo tipado del lenguaje
}
