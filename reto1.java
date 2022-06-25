//metodo double reporte recibe como entrada array double notas y retorna un array double promedio, menor nota y mayor nota de las notas

public class reto1{
    public static double [] reporte (double[]listaNotas){
        double [] promedio = new double[3];
        double menorNota = listaNotas[0];
        double mayorNota = listaNotas[0];
        double sumaNotas = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            sumaNotas += listaNotas[i];
            if (listaNotas[i] < menorNota) {
                menorNota = listaNotas[i];
            }
            if (listaNotas[i] > mayorNota) {
                mayorNota = listaNotas[i];
            }
        }
        promedio[0] = sumaNotas/listaNotas.length;
        promedio[1] = menorNota;
        promedio[2] = mayorNota;
        return promedio;
    }
}