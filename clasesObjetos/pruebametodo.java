package clasesObjetos;

public class pruebametodo {
    public static void main(String[] args) {
        metodos metodo1 = new metodos(); //crea un objeto de tipo metodos
        metodo1.a = 5; //asigna un valor a la variable a
        metodo1.b = 3; //asigna un valor a la variable b
        metodo1.sumar(); //llama al método sumar
        metodos metodo2 = new metodos(); //crea un objeto de tipo metodos
        metodo2.a = 8; //asigna un valor a la variable a
        metodo2.b = 2; //asigna un valor a la variable b
        metodo2.sumar(); //llama al método sumar

        int resultado = metodo2.sumardos(); //llama al método sumardos y guarda el valor retornado en la variable resultado
        System.out.println("El resultado de la suma es: " + resultado); //imprime el valor de la variable resultado

        
    }
}
