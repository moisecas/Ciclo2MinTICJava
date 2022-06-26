public class tutoria1_1 {
    public static void main(String[] args) throws Exception {        
        //cuenta regresiva hasta 100
        for (int i = 100; i >= 0; i--) { //for para contar regresivamente hasta 100

            if(i%2 == 0) { //si el numero es par, imprime el numero
                System.out.println(i);
                break; //se sale del for y no se ejecuta el resto de instrucciones
            }

            //System.out.println("el numero es: "+ i); //recorriendo el i desde 100 hasta 0 imprime el numero, hasta que i sea menor o igual a 0
        } //el i empieza en 100 y va decrementando hasta 0
    }//mientras i sea mayor o igual a 0, imprime el numero, y luego decrementa i

    
}
