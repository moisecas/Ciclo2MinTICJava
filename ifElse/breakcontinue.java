package ifElse;

public class breakcontinue {
    public static void main (String args[]){
        for (var contador = 0; contador <3 ; contador ++){
            if (contador % 2 != 0){ //si el contador es impar 
                continue; //salta la iteración actual
            }
            System.out.println("contador = " + contador);
             
        }
        //break; //termina el ciclo
        for (var contador = 0; contador <3 ; contador ++){
            if (contador % 2 == 0){ //si el contador es par
                break; //termina el ciclo
            }
            System.out.println("contador = " + contador);
             
        }
    }
}
