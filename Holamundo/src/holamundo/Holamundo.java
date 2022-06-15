/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author moise
 */
public class Holamundo {

    /**
     * @param args the command line arguments
     */
 String miVar; //declarando

    public static void main(String[] args) { //comentario 
       
        
        
        Holamundo claseInstanciaUno = new Holamundo(); //inicializando

        claseInstanciaUno.miVar = "nombre"; //instanciar la clase, dando un valor

        System.out.println("el nombre de la variable es: " + claseInstanciaUno.miVar); //mostramos por consola
        
    }
    
}
public class suma {
Number num1;
Number num2;
    public static void main(Number[] args){
        suma claseInstanciaDos = new suma();
        
        claseInstanciaDos.num1 = 1;
        claseInstanciaDos.num2 = 3;
        System.out.println("la suma es: " + claseInstanciaDos.num1 + claseInstanciaDos.num2);
                
    
    
    }
}

