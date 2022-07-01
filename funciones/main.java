package funciones;

public class main {
    //definir funciones
    public static void main(String[] args) { //metodo
        suma(5,6); //llamamos a la funcion suma
        restar(5,6); //llamamos a la funcion restar 
        System.out.println(suma(5.5, 6.5)); //llamamos a la funcion sumadecimales con sus parametros declarados
        //sobrecarga, mismo nombre a varias funciones pero que retornen distintos tipos de datos, según sea el tipo de dato usará una de las funciones, la int o la double
        cuentaRegresiva(200); //llamamos a la funcion cuenta regresiva con parametro 200, muestra por consola el numero de 200 a 0 
        factorial(10); //llamamos a la funcion factorial con parametro 10, muestra por consola el factorial de 10 

        System.out.println(sumar("moises",6,7)); //suma los argumentos que le envíe el usuario, en este caso 5 y 6, y 7
    }

    //varargs
   static int sumar(String nombre, int ...numeros){ //funcion suma, recibe string nombre y varargs, el ... indica que es un array de int
        int suma = 0; //variable suma, suma total de los numeros
        for(int num:numeros){ //ciclo for each para recorrer el array y realizar la suma de los numeros
            suma += num; //suma los numeros del array
        }
        return suma; //retorna la suma total de los numeros
    }

    //funciones dentro de clases que se ejecutan en el metodo main, el metodo esta dentro de la clase  
    //funciones recursivas

    static int factorial(int numero){
        if(numero>1){
            numero = numero*factorial(numero-1);
        }
        else{
            return numero*factorial(numero-1);
        }
        return numero; //retorna el numero factorial de un numero dado
    }

    static void cuentaRegresiva(int numero){
        numero--; //operador de decremento 
        if(numero>0){ //mientras sea mayor a 0 se ejecuta el codigo 
            System.out.println(numero); //imprime el numero
            cuentaRegresiva(numero); //se ejecuta a ella misma
        }else{
            System.out.println("Termino, llegamos a 0"); //si no es mayor a 0 se termina el codigo
        }
    }


    public static int sumas(int a, int b){ //funcion recursiva
        if(b==0){ //condicion de parada
            return a; //retorno de la funcion
        }else{
            return suma(a+1, b-1); //llamada recursiva
        }
    }

    //definir funciones

    static void restar(int a, int b) { //definimos la funcion restar con sus parametros declarados
        int c = a - b;
        System.out.println("La resta de " + a + " y " + b + " es " + c); //EN EL PRINT puedo llamar a la funcion restar con sus parametros declarados
        //usando return
        //return a - b;
    }

    public static int suma(int a, int b) { //puedo tener dos funciones nombradas iguales pero con distintos parametros y tipos de datos 
        return a + b; //retorna el resultado de la suma de los parametros declarados
    }
    static double suma(double a, double b) {
        return a + b; //retorna el resultado de la suma de los decimales
        
    }
    
}
