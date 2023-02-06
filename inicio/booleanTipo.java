package inicio;

public class booleanTipo {
    public static void main (String[] args){
        //declaración de variables
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        boolean varBoolean2 = false;
        System.out.println("varBoolean2 = " + varBoolean2); 

        //valores de tipo bandera
        if (varBoolean){ //si es verdadero
            System.out.println("La bandera es verdadera");
        } else { //si no es verdadero
            System.out.println("La bandera es falsa");
        }

        //si una persona es mayor de edad
        int edad = 19;
        boolean esMayorDeEdad = edad >= 18; //asignacion de tipo expresion booleana
        if (esMayorDeEdad){ //si es mayor de edad
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    } 

}
