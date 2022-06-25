import java.util.Scanner;

public class CondicionalesJava {
    public static void main(String args[]) {
        /* 
        //EJEMPLO CONDICIONAL IF:
        //Si una letra es igual a "c" entonces imprima un mensaje.

        char letra = 'a';
        if(letra == 'c')
            System.out.println("La letra es la C");
        */

         /*
        //EJEMPLO CONDICIONAL IF-ELSE:
        //Revise un valor booleano, si este es verdadero imprima "valor True", sino, imprima "valor False".
        int revision = 123145;

        if(revision == 1234){
            System.out.println("Valor true.");
        } else if(revision == 12345){
            System.out.println("acá si era.");
        }   
        else{
            System.out.println("Valor false.");
        }
         */

        /*  
        //EJEMPLO CONDICIONAL SWITCH:
        //Pedirle un número a un usuario, si el número es 2 decir que el número es par, si el número es 3 decir que
        //el número es impar, si el número es 5 decir que el número es multiplo de 5, en caso contrario, imprimir que
        //no se encontró un caso a evaluar

        Scanner sc = new Scanner(System.in);
        int valor = 0;
        valor = sc.nextInt();

        switch(valor){
            case 2:
                System.out.println("Número par");
                break;
            case 3:
            System.out.println("Número impar");
            break;
            case 5:
            System.out.println("Número multiplo de cinco.");
            break;
            default:
            System.out.println("No se encontró un caso a evaluar.");
            break;
        }
        sc.close();
        */

        /* 
        Scanner sc = new Scanner(System.in);
        double velocidad = 0;
        velocidad = sc.nextDouble();

        if(velocidad <= 30){
            System.out.println("velocidad adecuada");
        } else if(velocidad > 30 && velocidad <= 50){
            System.out.println("velocidad riesgosa");
        } else {
            System.out.println("exceso de velocidad");
        }
        
        sc.close();
        */
         /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora.");
        double num1, num2;

        String signo = "";

        System.out.println("Ingrese número 1:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese número 2:");
        num2 = sc.nextDouble();
        System.out.println("Ingrese operación a realizar:");
        signo = sc.next();

        switch(signo){
            case "+":
                System.out.println(num1 + " " + signo + " " + num2 +  " = " + (num1+num2));
                break;
            case "-":
                System.out.println(num1 + " " + signo + " " + num2 +  " = " + (num1-num2));
                break;     
            case "*":
                System.out.println(num1 + " " + signo + " " + num2 +  " = " + (num1*num2));
                break;               
            case "/":
                System.out.println(num1 + " " + signo + " " + num2 +  " = " + (num1/num2));
                break;                    
            default:
                System.out.println("NO SELECCIONO NINGUNA OPERACION EXISTENTE");
                break;
        }
        sc.close();
    }
    */
}
}