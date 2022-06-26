import java.util.Scanner; //permite interactuar con el usuario por medio de un teclado

public class tutoria1_3 {
    //capturar el numero del usuario
    public static void main(String[] args) throws Exception {
        int opcion = 0; //declaración de variable int


        System.out.println("seleccione una opción "); //imprime el mensaje
        System.out.println("1. Consultar saldo"); //imprime el mensaje
        System.out.println("2. Retirar"); //imprime el mensaje
        System.out.println("3. otros tramites"); //imprime el mensaje
        System.out.println("4. Salir"); //imprime el mensaje

        Scanner lectura = new Scanner(System.in); //crea un objeto de tipo Scanner, para capturar el numero del usuario
        opcion = lectura.nextInt(); //captura el numero del usuario y lo asigna a la variable opcion, captura entero 
        //se debe usar el nextInt() para capturar un numero entero

        while(opcion<4){
            switch (opcion) { //evalua la opcion ingresada por el usuario y según hace una acción
                case 1: 
                    System.out.println("el saldo es: "); //imprime el mensaje
                    break;//se sale del switch, rompemos el ciclo 
                case 2:
                    System.out.println("el retiro es: "); //imprime el mensaje
                    break;
                case 3:
                    System.out.println("otros tramites"); //imprime el mensaje
                    break;
                case 4:
                    System.out.println("gracias por usar nuestros servicios"); //imprime el mensaje
                    break;
                default: //si no se cumple ninguna condición, se asigna un mensaje de error
                    System.out.println("Opcion no encontrada"); //imprime el mensaje
                    break;
            
                
            }
            //volvemos a preguntar al usuario la opcion que desea realizar y se asigna a la variable opcion y se repite gracias al while
            System.out.println("seleccione una opción "); //imprime el mensaje
            System.out.println("1. Consultar saldo"); //imprime el mensaje
            System.out.println("2. Retirar"); //imprime el mensaje
            System.out.println("3. otros tramites"); //imprime el mensaje
            System.out.println("4. Salir"); //imprime el mensaje
            
            opcion = lectura.nextInt(); //captura el numero del usuario y lo asigna a la variable opcion, captura entero, sin esto se crea un bucle infinito
        }

        
        

    }
}
