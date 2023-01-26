package ifElse;

public class switchs {
    public static void main (String args[]){
        // Switch es recomendable para crear menú de opciones en una aplicación
        var numero = 2;
        var texto = "Valor desconocido";

        switch (numero){
            case 1:
                texto = "Numero uno";
                break;
            case 2:
                texto = "Numero dos";
                break;
            case 3:
                texto = "Numero tres";
                break;
            default:
                texto = "Caso no encontrado";
        }
        System.out.println("texto = " + texto); 
    } 
}
