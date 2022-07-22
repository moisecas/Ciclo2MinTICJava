package moodle;

public class usuario {
    //atributos private nombreCompleto string, documentoIdentidad String, password String, correo string, descripcion string
    private String nombreCompleto;
    private String documentoIdentidad;
    private String password;
    private String correo;
    private String descripcion;

    //constructor
    public usuario(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }

    //getters y setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //metodo actualiza la informacion de un usuario
    public void actualizar(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }
    
}
