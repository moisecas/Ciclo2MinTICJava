package Encampsulamiento.test;

import Encampsulamiento.dominio.Persona; //importar la clase Persona

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false); //variables locales
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Karla"); //cambiamos el nombre de la persona1
        System.out.println("persona1 nombre modificado: " + persona1.getNombre()); //imprime el nombre de la persona1
        System.out.println("persona1 sueldo: " + persona1.getSueldo()); //imprime el sueldo de la persona1
        System.out.println("persona1 eliminado: " + persona1.isEliminado()); //imprime el estado de eliminado de la persona1
        
        System.out.println("persona1 tostring: " + persona1.toString()); //usando el método toString
    }
}
