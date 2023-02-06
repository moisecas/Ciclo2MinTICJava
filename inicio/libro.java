package inicio;
import java.util.Scanner;

public class libro {
    public static void main (String[] args){
        System.out.println("Proporcino el titulo: ");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine(); 
        System.out.println("Proporcino el autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);

    }
}
