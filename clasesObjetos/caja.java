package clasesObjetos;

public class caja {
    //atributos, alto profundo y ancho
    int alto;
    int profundo;
    int ancho;

    //constructor vacio
    public caja() {
        System.out.println("Se ha creado un constructor vacio");
    }

    //metodo para calcular el volumen= anchoel alto por el profundo

    public void cajas (int alto, int profundo, int ancho) {
        this.alto = alto;
        this.profundo = profundo;
        this.ancho = ancho;
        var volumen = alto * profundo * ancho;
        System.out.println("El volumen de la caja es: " + volumen);
    }


}
