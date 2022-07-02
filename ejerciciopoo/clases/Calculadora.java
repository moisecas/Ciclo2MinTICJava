package ejerciciopoo.clases;

public class Calculadora {
    public static final double PI = 3.14; //atributo pi, publico para que sea visible desde afuera de la clase

    public static int sumar(int a, int b) {
        return a + b;
    }
    public static double sumar(double a, double b) {
        return a + b;
    }
    //sobrecarga de metodos 
    public int resta(int a, int b) {
        return a - b;
    }
    public double resta(double a, double b) {
        return a - b;
    }
}
