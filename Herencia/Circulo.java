/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author moise
 */
public class Circulo extends Figura{
    public static void main(String[] args) {
        Circulo cir = new Circulo(); 
        //usando los metodos de figura, heredando
        cir.setArea(10.6);
        cir.setPerimetro(40.5); 
        
        Circulo cir2 = new Circulo(); //de Circulo creo la variable cir2 que es otro circulo
        cir2.setArea(23.5);
        cir2.setPerimetro(10.2);
        
        System.out.println("area = " + cir2.getArea()); //heredando metodos que están en figura
        System.out.println("perimetro = " + cir2.getPerimetro()); //heredando metodos que están en figura 
        
        
        
    }
    
    
}
