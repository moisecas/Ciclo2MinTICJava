package reto4_tienda;

public class Cliente {
    //attributos nombreCompleto string, documentoIdentidad string, totalAPagar int, fechaCompra string, numeroFactura string
    private String nombreCompleto;
    private String documentoIdentidad;
    private int totalAPagar;
    private String fechaCompra;
    private String numeroFactura;

    //constructor
    public Cliente(String nombreCompleto, String documentoIdentidad, int totalAPagar, String fechaCompra, String numeroFactura) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.totalAPagar = totalAPagar;
        this.fechaCompra = fechaCompra;
        this.numeroFactura = numeroFactura;
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

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    
}
