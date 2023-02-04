package clasesObjetos;

public class pruebametodo {
    public static void main(String[] args) {
        //variables locales 
        var a = 5;
        var b = 3;  
        otroMetodo(); //llama al método otroMetodo, puedo llamarlos debido a que ambos son void

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

        int resultado2 = metodo2.sumarTres(4, 7); //llama al método sumarTres y guarda el valor retornado en la variable resultado2
        System.out.println("El resultado de la suma es: " + resultado2); //imprime el valor de la variable resultado2
        
        metodos metodo3 = new metodos(8, 7); //crea un objeto de tipo metodos y le asigna los valores 4 y 7 a las variables a y b
        metodo3.sumar(); //llama al método sumar

    }

    public static void otroMetodo() {
        System.out.println("Hola desde otro método");
    }
}
