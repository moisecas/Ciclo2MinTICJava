package clasesObjetos;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez"); //nuevo objeto de tipo string
        System.out.println(persona1); 

        
    }
}

class Persona{
    //atributos
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){ //constructor
        //inicializar los atributos
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this); //imprime la referencia de memoria del objeto
        new imprimir().imprimir(this); //se crea un objeto de tipo imprimir y se llama al método imprimir
    }
}

class imprimir{
    public void imprimir(Persona p){ //recibe un objeto de tipo persona
        System.out.println("p = " + p); //imprime la referencia de memoria del objeto
        System.out.println("impresion del objeto actual (this): " + this); //imprime la referencia de memoria del objeto
    } 
}
