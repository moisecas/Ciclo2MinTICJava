package ifElse;

import java.util.Scanner;

public class calificaciones {

    public static void main (String args[]){
        System.out.println("Proporciona la nota entre 0 y 10");
        Scanner consola = new Scanner(System.in);
        var nota = Integer.parseInt(consola.nextLine());
        var mensaje = "no es posible determinar"; 

        switch(nota){
            //Si está entre 9 y 10: imprimir una A
            case 9:
            case 10:
                mensaje = "A";
                break;
            //Si está entre 8 y 9: imprimir una B
            case 8:
                mensaje = "B";
                break;
            //Si está entre 7 y 8: imprimir una C
            case 7:
                mensaje = "C";
                break;
            //Si está entre 6 y 7: imprimir una D
            case 6:
                mensaje = "D";
                break;
            //Si está entre 0 y 6: imprimir una F
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                mensaje = "F";
                break;
            //Si no está entre 0 y 10: imprimir un mensaje de error
            default:
                mensaje = "Nota no válida";
                break;          
                             
            
        }  
        System.out.println("su nota es de: " + nota + " " + "y fue: " + mensaje) ;


    }
    
}
