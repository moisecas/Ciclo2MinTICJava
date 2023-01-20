public class operadoresigualdad {
    public static void main (String[] args){
        var a = 3;
        var b = 2;
        var c = a == b; //comparar si a es igual a b
        System.out.println("c = " + c);
        var d = a != b; //comparar si a es diferente a b
        System.out.println("d = " + d); 

        var cadena = "Hola";
        var cadena2 = "Adios"; 
        var e = cadena == cadena2; //comparar si cadena es igual a cadena2 
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); //comparara si cadena es igual a cadena2
        System.out.println("f = " + f); //equals es un metodo de la clase String

        //relacionales 
        var g = a > b; //comparar si a es mayor que b
        System.out.println("g = " + g);

        //par o impar 
        if (a % 2 == 0){ //si el residuo de a entre 2 es igual a 0
            System.out.println("Es par");
        } else { //si no es par es impar 
            System.out.println("Es impar");
        } 

        var edad = 18; 
        var adulto = 18;

        if (edad >= adulto){ //si edad es mayor o igual a adulto
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}
