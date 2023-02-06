package inicio;

import java.util.Scanner;

public class precedencia {
    public static void main (String args[]){
        
        var x = 5;
        var y = 10;
        var z = ++x + y--; //primero se incrementa x en 1, despues se suma x a y, despues se decrementa y en 1
        System.out.println("x = " + x); //imprime x = 6
        System.out.println("y = " + y); //imprime y = 9
        System.out.println("sume = " + z); //imprime z = 16  

        var resultado = 4 + 5 * 6 / 3; //primero se multiplica 5 por 6, despues se divide 30 entre 3, despues se suma 4 a 10
        System.out.println("resultado = " + resultado); //imprime resultado = 14
        
        //area y preriometro de un rectangulo
        var base = 6;
        var altura = 8;
        var area = base * altura;
        var perimetro = 2 * (base + altura);
        System.out.println("area = " + area); //imprime area = 48
        System.out.println("perimetro = " + perimetro); //imprime perimetro = 28

        //Solicitar por consola dos numeros 
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numero 1: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero 2: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        //mayor o menor ternario
        var numeroMayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("numeroMayor = " + numeroMayor); //imprime numeroMayor = 10
         


    }
}
