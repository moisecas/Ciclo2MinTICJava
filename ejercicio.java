public class ejercicio {
    public static void main (String args[]){
        var resultado = (3>2) ? "verdadero" : "falso"; //si 3 es mayor a 2, resultado sera verdadero, si no sera falso
        System.out.println("resultado = " + resultado); //imprime resultado = verdadero 

        var resultadoDos = (5<4) ? "verdadero" : "falso"; //si 5 es menor a 4, resultadoDos sera verdadero, si no sera falso
        System.out.println("resultadoDos = " + resultadoDos); //imprime resultadoDos = falso 

        var numero = 9;
        var resultadosTres = (numero % 2 == 0) ? "Numero par" : "Numero impar"; //si numero es divisible entre 2, resultadosTres sera Numero par, si no sera Numero impar 
        System.out.println("resultadosTres = " + resultadosTres); //imprime resultadosTres = Numero impar
        
        

    }
}
