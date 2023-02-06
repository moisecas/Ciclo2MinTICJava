package inicio;
public class shorts {
    public static void main(String[] args) {
        short numeroShort = 32767; //16 bits
        System.out.println("minimo Short = " + Short.MIN_VALUE);
        System.out.println("maximo Short = " + Short.MAX_VALUE);
        short s = (short)32768; //conversión de tipos de datos
        System.out.println("s conversion = " + s); //imprime -32768 porque el valor 32768 no cabe en un short
        //short a = 32768; //error de compilación por que el valor 32768 no cabe en un short
    }
}
