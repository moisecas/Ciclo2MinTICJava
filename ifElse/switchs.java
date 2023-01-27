package ifElse;

public class switchs {
    public static void main (String args[]){
        // Switch es recomendable para crear menú de opciones en una aplicación
        var numero = 2;
        var texto = "Valor desconocido";

        switch (numero){
            case 1: // Si numero es igual a 1 entonces texto = "Numero uno"
                texto = "Numero uno";
                break; // Si no se pone el break, se ejecuta el siguiente case
            case 2:
                texto = "Numero dos";
                break;
            case 3:
                texto = "Numero tres";
                break;
            default: // Si no se cumple ninguna de las condiciones anteriores
                texto = "Caso no encontrado";
        }
        System.out.println("texto = " + texto); 

        var mes = 1;
        var estacion="estación desconocida"; 

        switch (mes){
            case 1: case 2: case 12: // Si mes es igual a 1, 2 o 12 entonces estacion = "Invierno"
                estacion = "Invierno";
                break;
            case 3: case 4: case 5: // Si mes es igual a 3, 4 o 5 entonces estacion = "Primavera"
                estacion = "Primavera";
                break;
            case 6: case 7: case 8: // Si mes es igual a 6, 7 o 8 entonces estacion = "Verano"
                estacion = "Verano";
                break;
            case 9: case 10: case 11: // Si mes es igual a 9, 10 o 11 entonces estacion = "Otoño"
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }
        System.out.println("estacion = " + estacion); 
        
    } 
}
