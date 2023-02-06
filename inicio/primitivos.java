package inicio;
public class primitivos {
    public static void main(String[] args){
        //tipos primitivos enteros (byte, short, int, long)
        byte numeroByte = 12; //8 bits
        //byte numeroByte2 = 129; //error de compilación por que el valor 129 no cabe en un byte
        System.out.println("minimo Byte = " + Byte.MIN_VALUE);
        System.out.println("maximo Byte = " + Byte.MAX_VALUE); 
        byte b = (byte)129; //conversión de tipos de datos
        System.out.println("b = " + b); //imprime -127 porque el valor 129 no cabe en un byte
    }
}
