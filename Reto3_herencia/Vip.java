package Reto3_herencia;

public class Vip extends Asistente {
    //pantallas boolean credencialesPrevia string
    private boolean[] pantallas = new boolean[]{false,false,false};
    private String credencialesPrevia;

    //constructor
   public Vip (String idTiquete, String nombreCompleto, String direccionResidencia) {
       
       super(idTiquete, nombreCompleto, direccionResidencia); //super llama al constructor de la clase padre Asistente
     
       this.credencialesPrevia = "";
    }
    //get y set 
    public boolean [] getPantallas() {
        return pantallas;
    }
    public void setPantallas(boolean [] pantallas) {
        this.pantallas = pantallas;
    }
    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }
    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }


    //metodo generarCredencialesPrevia Genera de manera aleatoria un número entero menor a 100000 (no puede generarse ninguno otro después de generar el primero) y lo convierte en un String que será la credencial de acceso a la transmisión de la previa, guardando el resultado en el atributo credencialesPrevia
    public void generarCredencialesPrevia() {
        int numero = (int) (Math.random() * 100000);
        this.credencialesPrevia = Integer.toString(numero);
    }

    //metodo asignarPantalla El método recibe como parámetro un entero de 1 a 3 que representará alguna de las tres pantallas en el array pantallas con las que el comprador del tiquete puede compartir la transmisión. Si pantallas[pant alla] es igual a true, lo cambia a false y si pantallas[pant alla] es igual a false lo cambia a true. Si recibe un entero fuera del rango 1-3, mantiene la asignación intacta
    public void asignarPantalla(int pantalla) {
        if (pantalla == 1) {
            pantallas[0] = !pantallas[0];
        } else if (pantalla == 2) {
            pantallas[1] = !pantallas[1];
        } else if (pantalla == 3) {
            pantallas[2] = !pantallas[2];
        }
    }

}
