package inicio;
public class ejerciciooperadores {
    public static void main (String[] args){
        var a = 10; 
        var valorMinimo = 0;
        var valorMaximo = 10;

        //&& ambas deben ser verdaderas para que el resultado sea verdadero 
        var resultado = a >= valorMinimo && a <= valorMaximo; //comparar si a es mayor o igual a valorMinimo y a es menor o igual a valorMaximo
        System.out.println("resultado = " + resultado); //si a es mayor o igual a valorMinimo y a es menor o igual a valorMaximo, resultado sera true, si no sera false

        if (resultado){ //si resultado es true
            System.out.println("Dentro de rango");
        } else { //si resultado es false
            System.out.println("Fuera de rango");
        }

        //or 
        var vacaciones = false;
        var diaDescanso = true;

        if (vacaciones || diaDescanso){ //si vacaciones es true o diaDescanso es true
            System.out.println("Padre puede asistir al juego del hijo");
        } else { //si vacaciones es false y diaDescanso es false
            System.out.println("El padre esta ocupado");
        }



    }
}
