/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3ciclo2;

/**
 *
 * @author moise
 */
public class Matriz2 {
    
    public static void main(String[] args){
        int [][] matrizBidi;
        matrizBidi = new int [2][2];
        matrizBidi[0][0] = 1; 
        matrizBidi[0][1] = 2; 
        matrizBidi[1][0] = 3; 
        matrizBidi[1][1] = 4; 
        /*
        {1,2}
        {3,4} representación de la matriz
        */
        //para imprimir matriz un ciclo por dimensión 
        for (int i = 0; i <= matrizBidi.length-1; i++) {//objeto de tipo double, recorre, va el -1, posiciones e indices arrancan en 0
            
            for (int j = 0; j < matrizBidi[i].length; j++) {
                System.out.println("Posición::" + matrizBidi[i][j]);//notas[i], i es lo que va iterando por la posición
            }
            
             
        }
    }
    
}
