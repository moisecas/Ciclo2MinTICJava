package TutoriaHerencia;

public class Calculadora {
    //metodo para operaciones básicas
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    //metodo para operaciones cientificas
    public static int potencia(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int raiz(int a) {
        return (int) Math.sqrt(a);
    }

    public static int seno(int a) {
        return (int) Math.sin(a);
    }
}
