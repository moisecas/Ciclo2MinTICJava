public class conversiones {
    public static void main (String[] args){
       var edad = "20";
       var edaddos = Integer.parseInt(edad); //conversion de String a int
         System.out.println("edad = " + (edaddos + 1)); //se suma 1 a la edad
         System.out.println("var edad string se concatena"+ edad + 1); //se concatena 1 a la edad

            var valorPI = "3.1416";
            var valorPIDos = Double.parseDouble(valorPI); //conversion de String a double
            System.out.println("valorPI = " + valorPIDos);
    }
}
