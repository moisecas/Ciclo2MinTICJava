package inicio;
public class index {
    public static void main(String[] args) {
        int a = 1; //declarar entero int 
        System.out.println(a); //imprimir entero int 

        a = 2; //asignar entero int
        System.out.println(a); //imprimir entero int

        String b = "hola"; //declarar string
        System.out.println(b); //imprimir string

        b = "adios"; //asignar string
        System.out.println(b); //imprimir string 

        //var 
        var c = 15; //declarar entero int, java infiere el tipo de dato segun el valor
        System.out.println(c); //imprimir entero int

        var nombre = "Juan"; //declarar string, java infiere el tipo de dato segun el valor
        System.out.println("el nombre es: " + nombre); //imprimir string 

        //valores permitidos en el nombre de una variable
        int _a = 1; //underscore
        int $a = 1; //dollar
        int a1 = 1; //numero
        int a_ = 1; //underscore al final
        int a$ = 1; //dollar al final
        int a1_ = 1; //numero y underscore al final
        int a1$ = 1; //numero y dollar al final
        int a_1 = 1; //underscore y numero al final
        int a$1 = 1; //dollar y numero al final
        int a_1$ = 1; //underscore, numero y dollar al final
        int a$1_ = 1; //dollar, numero y underscore al final
        int a1_2 = 1; //numero, underscore y numero al final
        System.out.println(_a + $a + a1 + a_ + a$ + a1_ + a1$ + a_1 + a$1 + a_1$ + a$1_ + a1_2); //imprimir suma de variables

        System.out.println("concatenación de cadenas");

        //concatenación de cadenas
        var usuario = "Moiso"; 
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario; //concatenación de cadenas
        System.out.println("union es = " + union); //imprimir concatenación de cadenas 

        var i = 3;
        var j = 4;
        System.out.println(i + j); //imprimir suma de enteros
        System.out.println(i + j + " "+ usuario); //imprimir suma de enteros y concatenación de cadenas
        System.out.println(usuario + i + j); //imprimir concatenación de cadenas y suma de enteros
        System.out.println(usuario + (i + j)); //imprimir concatenación de cadenas y suma de enteros con parentesis priorizando el resultado
        



    }
} 

