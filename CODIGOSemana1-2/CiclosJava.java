import java.util.Scanner;

public class CiclosJava {
    public static void main(String args[]) {
         /* 
        //EJEMPLO CICLO WHILE:
        //Se debe crear un programa que imprima los números pares del 10 al cero,
        //si el número es impar imprimir "número impar", si es par, imprimir el número. 
        
        int numero = 10;
        while(true){
            if(numero % 2 == 0){
                System.out.println(numero);
            } else{
                System.out.println("Número impar.");
            }
            numero = numero - 1;
            if(numero < 0){
                break;
            }
        }
        */

         /* 
        //EJEMPLO CICLO DO-WHILE:
        //Crear un programa que le pida al usuario números por consola, si el usuario ingresa un número
        //negativo entonces el programa finaliza, sin embargo, el programa debe leer al menos un número,
        //adicional, imprimir un mensaje por consola diciendo "el número ingresado fue: " y el número.
        
        int numeroDoWhile = 0;
        Scanner sc = new Scanner(System.in);
        
         do{
            numeroDoWhile = sc.nextInt();
            System.out.println("El número ingresado fue: " + numeroDoWhile);
         } 
        while(numeroDoWhile >= 0);
        sc.close();
        */
         /* 
        //EJEMPLO CICLO FOR:
        //Crear un software que reciba una palabra e imprima cada letra de la palabra, la palabra debe estar
        //predefinida en el código, no es necesario ingresarla por teclado.
        
        String palabra = "CiclosEnJava";

        for(int i = 1; i <= palabra.length(); i++){
            System.out.println(palabra.substring(i-1, i)); //palabra[0], palabra[1]
        }
        */
        /* 
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        while(true){
            if(num1 % 2 != 0){
                System.out.println(num1);
            } 

            num1 += 1;
            if(num1 > num2){
                break;
            }
        }
        sc.close();
        */
        /* 
        Scanner sc = new Scanner(System.in);
        int num1; 
        int sum = 0;

        while(true){
            num1 = sc.nextInt();
            if(num1 > 0){
                sum += num1;
                System.out.println(sum);
            } else {
                break;
            }
            
        }
        sc.close();
    }
}
*/

/*
 * 
 * numero1 = 1;
 * numero1++ --2
 * numero1-- --3
 * numero1 += 1 --2
 * numero1 =+ 10;
 * 
 * 
 * numero1 = 0;
 * while(numero1 < 2){
 * 
 * print(numero1);
 * ++numero1;
 * }
 * 
 * 
 * 
 */
 }
}