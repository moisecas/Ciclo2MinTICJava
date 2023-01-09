
import java.util.Scanner;



public class conversiones {
    public static void main (String[] args){
       var edad = "20";
       var edaddos = Integer.parseInt(edad); //conversion de String a int
         System.out.println("edad = " + (edaddos + 1)); //se suma 1 a la edad
         System.out.println("var edad string se concatena"+ edad + 1); //se concatena 1 a la edad

            var valorPI = "3.1416";
            var valorPIDos = Double.parseDouble(valorPI); //conversion de String a double
            System.out.println("valorPI = " + valorPIDos);

            //pedir un valor por consola de tipo string y convertirlo a int para sumarlo
            
            System.out.println("Proporcione el valor de radio: ");
            Scanner consola = new Scanner(System.in);
            var radio = Double.parseDouble(consola.nextLine()); //conversion de String a double
            var area = Math.PI * Math.pow(radio, 2);
            System.out.println("area = " + area);

            


    }
}
