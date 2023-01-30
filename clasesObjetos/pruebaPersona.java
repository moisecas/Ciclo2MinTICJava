package clasesObjetos;

public class pruebaPersona {
    public static void main (String args[]){
        persona persona1 = new persona(); //crea un objeto de tipo persona
        persona1.nombre = "Juan"; //asigna un valor a la variable nombre
        persona1.apellido = "Perez"; //asigna un valor a la variable apellido
        persona1.desplegarInformacion(); //llama al método desplegarInformacion
        persona persona2 = new persona(); //crea un objeto de tipo persona
        persona2.nombre = "Karla"; //asigna un valor a la variable nombre
        persona2.apellido = "Gomez"; //asigna un valor a la variable apellido
        persona2.desplegarInformacion(); //llama al método desplegarInformacion
    }
     
}
