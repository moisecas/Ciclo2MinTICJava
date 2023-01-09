

import java.util.Scanner;

public class tarea {
    public static void main (String[] args){
        System.out.println("Proporcione su nombre: ");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("Proporcione su id: ");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcione el precio: ");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Si o No es envío gratis: ");
        var envio = consola.nextLine();
        var envioBoolean = Boolean.parseBoolean(envio); //conversion de String a boolean
      
    }
}