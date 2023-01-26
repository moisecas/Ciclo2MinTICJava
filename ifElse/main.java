package ifElse;

import java.util.Scanner;

public class main {
    public static void main (String args[]){
        var condicion = true; 

        if(condicion){
            System.out.println("verdadero");

        } 
        else{
            System.out.println("condicion falsa");
        }
               

        var numero = 4; 
        var numeroTexto = "numero desconocido";

        if(numero == 1){
            numeroTexto = "numero uno";
        }
        else if(numero == 2){
            numeroTexto = "numero dos";
        }
        else if(numero == 3){
            numeroTexto = "numero tres";
        }
        else if(numero == 4){
            numeroTexto = "numero cuatro";
        }
        else{
            numeroTexto = "numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        //solicitar valor mes scanner = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 12");
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine()); 
        var estacion = "estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        }
        else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "primavera";
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "verano";
        }
        else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "otoño";
        }
        else{
            estacion = "mes no encontrado";
        }                

        System.out.println("estacion = " + estacion); 
    }

    

}
