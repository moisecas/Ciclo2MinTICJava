package Libro;

public class LibroDigital extends Libro {
    //ATRIBUTOS espacioEnDisco, 
    // datosTransferidos se inicializa en el método constructor como igual a espacioEnDisco multiplicado por prestamos
    private double espacioEnDisco;
    public double datosTransferidos; //datosTransferidos = espacioEnDisco * prestamos 
    private String formato; 
     

    
    //CONSTRUCTOR
    public LibroDigital(double espacioEnDisco, String formato, String titulo, String nombreAutor, String apellidosAutor, String fechaPublicacion, int numeroPaginas, int prestamos) {
        super(titulo, nombreAutor, apellidosAutor, fechaPublicacion, numeroPaginas, prestamos);
        this.espacioEnDisco = espacioEnDisco;
        this.formato = formato;
    }
    
    //MÉTODO prestar() DE LA CLASE LibroDigital.
    //RECUERDE QUE ES UN MÉTODO SOBREESCRITO DE
    //LA CLASE PADRE Libro. USE LA INSERCIÓN DE
    //CÓDIGO DE NETBEANS.
    @Override
    public void prestar() {
       
        double datosSubidos = getDatosTransferidos();
        datosSubidos =  datosSubidos + espacioEnDisco;
        setDatosTransferidos(datosSubidos);
        //cantidad de veces prestado
        int numPrestamos = getPrestamos();
        numPrestamos ++;
        setPrestamos(numPrestamos);
        
      

        


    
    }

    //GETTERS Y SETTERS
    public double getEspacioEnDisco() {
        return espacioEnDisco;
    }

    public void setEspacioEnDisco(double espacioEnDisco) {
        this.espacioEnDisco = espacioEnDisco;
    }

    public double getDatosTransferidos() {
        return datosTransferidos;
    }

    public void setDatosTransferidos(double datosTransferidos) {
        this.datosTransferidos = datosTransferidos;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }


}
