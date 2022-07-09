package reto_3;

public class TarjetaOro extends TarjetaCine{
    private String [] beneficiosDescripcion={"Boleto Gratis","Crispetas Gratis","Gaseosa Gratis"};
    private boolean [] beneficiosEstado={true, true, true};
    private static final int PORCENTAJE_DESCUENTO = 20;

    
        //constructor
    public TarjetaOro(String idTarjeta,String nombreCompleto,String email
        ,String telefono,int edad){
        super(idTarjeta,nombreCompleto,email,telefono,edad, PORCENTAJE_DESCUENTO); 
    }// cierra constructo

    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }
    //metodo
    public boolean redimirBeneficio(int posicionBeneficio){
        if(beneficiosEstado[posicionBeneficio]==true){
            beneficiosEstado[posicionBeneficio]=false;   
            return true;
        }
        else{
            return false;
        }
    }
}// cierra clase tarjetaOro