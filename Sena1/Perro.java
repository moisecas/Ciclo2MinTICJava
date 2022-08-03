package Sena1;

//clase main
public class Perro {
    //atributos nombreCompleto string, documentoIdentidad string, totalAPagar int, fechaCompra string, numeroFactura string
    String nombreCompleto;
    String documentoIdentidad;
    int totalAPagar;
    String fechaCompra;
    String numeroFactura;

    //constructor
    public Perro(String nombreCompleto, String documentoIdentidad, int totalAPagar, String fechaCompra, String numeroFactura) {
        this.nombreCompleto = "junior";
        this.documentoIdentidad = "123456789";
        this.totalAPagar = 100;
        this.fechaCompra = "12/12/12";
        this.numeroFactura = "12345";
    }     
    //imprimir objeto perro
    public void imprimirPerro(){
        System.out.println("nombreCompleto: "+nombreCompleto);
        System.out.println("documentoIdentidad: "+documentoIdentidad);
        System.out.println("totalAPagar: "+totalAPagar);
        System.out.println("fechaCompra: "+fechaCompra);
        System.out.println("numeroFactura: "+numeroFactura);
    }
}







