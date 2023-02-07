package SobrecargaMetodos.testOperaciones;

import SobrecargaMetodos.operaciones.Operaciones;

public class testOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 6); //llamamos al método sumar de la clase Operaciones
        System.out.println("resultado = " + resultado); //imprime 11

        var resultado2 = Operaciones.sumar(5.5, 6.5); //llamamos al método sumar de la clase Operaciones 
        System.out.println("resultado2 = " + resultado2); //imprime 12.0
        //se crea un tipo de variable por tipo de dato operado en el método sumar de la clase Operaciones 

        

    }
}
