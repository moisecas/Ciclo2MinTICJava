public class primitivosfloat {
    public static void main (String[] args){
        //tipos primitivos de punto flotante (float, double)
       float numeroFloat = 30.0F;  
       float numeroFloatDos = (float) 10.0; //conversión de tipos de datos 
         System.out.println("numeroFloat = " + numeroFloat);
            System.out.println("numeroFloatDos = " + numeroFloatDos);
        System.out.println("minimo Float = " + Float.MIN_VALUE);
        System.out.println("maximo Float = " + Float.MAX_VALUE);    
        //error excedio float
        //float f = 3.4028235E38F; //error de compilación por que el valor 3.4028235E38F no cabe en un float
    }

    
}
