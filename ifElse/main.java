package ifElse;

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
    }
}
