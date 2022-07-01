package funciones;

public class math {
    //mostrar pi
    public static void main(String[] args) {
        System.out.println(Math.PI); //muestra el valor de pi y así con otros valores fijos
        //potencia
        System.out.println(Math.pow(2,3)); //muestra el valor de la potencia de 2 elevado a 3
        //raiz cuadrada
        System.out.println((int)(Math.sqrt(9))); //muestra la raiz cuadrada de 9, solo muestra el entero de la raiz cuadrada
        //redondeo
        System.out.println(Math.round(3.5)); //muestra el numero redondeado de 3.5, si es por ejemplo 5.8 se muestra 6 y si es 5.2 se muestra 5. 
        //random
        System.out.println(Math.random()); //muestra un numero random entre 0 y 1

        int numeroRandom = (int) (Math.random()*10); //muestra un numero random entre 0 y 10
        System.out.println(numeroRandom); //muestra el numero random entre 0 y 10

        //maximo
        System.out.println(Math.max(5,6)); //muestra el numero mayor de 5 y 6
        //minimo
        System.out.println(Math.min(5,6)); //muestra el numero menor de 5 y 6

        double moneda = (double)Math.round(3.4289)*100d/100; //100d/100 es para que muestre el numero con 2 decimales, d es la cantidad e 0s que quiero que muestre
        System.out.println(moneda); //muestra el numero con dos decinales de 3.4289
    }
}
