package clasesObjetos;

public class pasoporreferencia {
    public static void main(String[] args) {
        persona persona1 = new persona(); 
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1=cambioValor(persona1); //traemos el metodo y le pasamos el objeto persona1
    }

    public static persona cambioValor(persona persona) { //recibe un objeto de tipo persona
        persona.nombre = "Karla"; //cambia el valor del objeto persona
        System.out.println("persona nombre = " + persona.nombre); //imprime el valor del objeto persona
        return persona; //retorna el objeto persona
    }
}
