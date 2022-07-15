package Pruebas;


public class Prueba {
    //metodo para validar si dos string son iguales
    public static boolean sonIguales(String s1, String s2){
        return s1.equals(s2);
    }
    
    public void booleanCheck(){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 && b2;
        boolean b4 = b1 || b2;
        boolean b5 = !b1;
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    } 
    //assert
    public void assertCheck(){
        int a = 5;
        int b = 10;
        assert a < b : "a no es menor que b";
    }

    

}
