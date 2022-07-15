package Pruebas;

public class Input_teclado {
    public static void main(String[] args) {
        
        String nombre; 
        System.out.println("Ingrese su nombre: ");
        nombre = System.console().readLine();
        System.out.println("Su nombre es: " + nombre);
    }
    
}
