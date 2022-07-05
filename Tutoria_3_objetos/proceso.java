package Tutoria_3_objetos;

public class proceso {
    private double yardas;
    private double pulgadas;

    //constructor
    public proceso(double yardas, double pulgadas) {
        this.yardas = yardas;
        this.pulgadas = pulgadas;

    }

    //set y get yardas
    public void setYardas(double yardas) { //hace referencia a la variable yardas
        this.yardas = yardas; //asigna el valor de la variable yardas a la variable local
    }

    public double getYardas() { //retorna la variable yardas 
        return yardas; //get es para obtener el valor de la variable local
    }

    //set y get pulgadas
    public void setPulgadas(double pulgadas) { //hace referencia a la variable pulgadas
        this.pulgadas = pulgadas;
    }

    public double getPulgadas() { //retorna la variable pulgadas 
        return pulgadas;
    }

    //metodo calcular 
    public void calcular(double pies) { 
        double resultadoYardas = (pies/3); //va para setyardas
        setYardas(resultadoYardas); //se guarda el resultado en la variable yardas 

        double resultadoPulgadas = (pies*12); //va para setpulgadas
        setPulgadas(resultadoPulgadas); //se guarda el resultado en la variable pulgadas 
    }
}
