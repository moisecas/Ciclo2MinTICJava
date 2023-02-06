package herencia.Domain;

public class Persona {
    //atributos private 
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //constructor vacio
    public Persona() { //variables locales
    } //para que podamos crear objetos de tipo persona

    //constructor con argumentos
    public Persona(String nombre) { //variables locales
        this.nombre = nombre;
    }

    //constructor con argumentos
    public Persona(String nombre, char genero, int edad, String direccion) { //variables locales
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    } 

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString() { //sobreescribir el método toString para imprimir los atributos
        return "Persona{" + "nombre=" + this.nombre + ", genero=" + this.genero + ", edad=" + this.edad + ", direccion=" + this.direccion + '}';
    }

    
}
