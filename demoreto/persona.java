package demoreto;



public abstract class persona {

  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public persona(String nombre) {
    super();
    this.nombre = nombre;
  }
  
  public abstract int  correr() ;
}
