package Reto3_herencia;

public class Asistente {
    //atributos privados idTiquete string, nombreCompleto string, direccionResidencia string, credenciales string, tipoAsistente string
    //credenciales debe ser igual a las dos comillas “” sin encerrar caracter alguno
    private String idTiquete;
    private String nombreCompleto;
    private String direccionResidencia;
    private String credenciales; 

    //constructor 
    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia) {
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
        this.credenciales = "";
        
    }

    //get y set
    public String getIdTiquete() {
        return idTiquete;
    }
    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getDireccionResidencia() {
        return direccionResidencia;
    }
    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }
    public String getCredenciales() {
        return credenciales;
    }
    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }


    //metodo generarCredenciales void Genera de manera aleatoria un número entero menor a 100000 (no puede generarse ninguno otro después de generar el primero) y lo convierte en un String que será la credencial de acceso a la transmisión, guardando el resultado en el atributo credenciales.
    public void generarCredenciales() {
        int numero = (int) (Math.random() * 100000);
        this.credenciales = Integer.toString(numero);
    }
}