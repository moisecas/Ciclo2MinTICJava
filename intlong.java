public class intlong {
    public static void main(String[] args){
        //tipos primitivos enteros (byte, short, int, long)
        int numeroInt = 2147483647; //32 bits
        System.out.println("minimo Int = " + Integer.MIN_VALUE);
        System.out.println("maximo Int = " + Integer.MAX_VALUE);
        int i = (int)2147483648L; //conversión de tipos de datos
        System.out.println("i conversion = " + i); //imprime -2147483648 porque el valor 2147483648 no cabe en un int
        //int a = 2147483648; //error de compilación por que el valor 2147483648 no cabe en un int
        long numeroLong = 9223372036854775807L; //64 bits
        System.out.println("minimo Long = " + Long.MIN_VALUE);
        System.out.println("maximo Long = " + Long.MAX_VALUE);
        long l = 922337203685477L; //conversión de tipos de datos
        System.out.println("l conversion = " + l); //imprime -9223372036854775808 porque el valor 9223372036854775808 no cabe en un long
        //long a = 9223372036854775808; //error de compilación por que el valor 9223372036854775808 no cabe en un long
    }
}
