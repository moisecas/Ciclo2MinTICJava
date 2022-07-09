package Reto3_herencia;

public class Preferencial extends Asistente {
    //participaSorteo boolean
    private boolean participaSorteo;

    //constructor
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;
    }

    //get y set
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }
    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }



    //metodo participarSorteo void  Se cambia el atributo participaSorteo. Aprovechando el getter y el setter de este. Si participaSorteo es igual a true lo cambia a false, y si participaSorteo es igual a false lo cambia a true.
    public void participarSorteo() {
        if (this.participaSorteo == true) {
            this.participaSorteo = false;
        } else {
            this.participaSorteo = true;
        }
    }
}
    

