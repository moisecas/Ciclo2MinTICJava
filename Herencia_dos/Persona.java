package Herencia_dos;

//clase PADRE PERSONA
public class Persona { 
    protected String nombre; //protected es para que sea visible en la clase hija
    protected String genero   ; //protected es para que sea visible en la clase hija
    protected int edad; //protected es para que sea visible en la clase hija
    protected String direccion; //protected es para que sea visible en la clase hija

    //constructor

    public Persona() { //vacio 
        
    }

    public Persona(String nombre) { //solo nombre
        this.nombre = nombre;
        
    }

    public Persona(String nombre, String genero, int edad, String direccion) { //todos 
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
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

    //to string use string builder
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(); //objeto de la clase string builder, sb es una variable de tipo string builder
        sb.append("Nombre: ").append(nombre).append("\n"); //append es para agregar algo a un string, append es para agregar algo a un string
        sb.append("Genero: ").append(genero).append("\n"); 
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Direccion: ").append(direccion).append("\n");
        return sb.toString();
    }

    
    

}
