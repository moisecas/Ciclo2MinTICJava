package clasesObjetos;

public class pasoporvalor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        cambioValor(x); 
    }
    public static void cambioValor(int arg1) {
        System.out.println("arg1 = " + arg1); //imprime el valor de arg1
    }
}
