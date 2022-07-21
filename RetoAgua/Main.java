package RetoAgua;

public class Main {
    //metodo analizar calidad de agua, recibe un array con los valores de calidad de agua, retorna un array con el promedio de calidad de agua, el menor valor y el mayor valor de calidad de agua
    public static double [] analizarCalidadAgua (double[] listaCalidadAgua){ //metodo double, decimales de calidad de agua en el array listaCalidadAgua porque es un array de double, new double [3] declara un array de 3 posiciones
        double [] promedio = new double[3]; //declaración de variables double, new double [3] declara un array de 3 posiciones
        double menorCalidadAgua = listaCalidadAgua[0]; //asignano un array de calidad de agua a una variable double, empieza en 0 
        double mayorCalidadAgua = listaCalidadAgua[0];//asignano un array de calidad de agua a una variable double
        double sumaCalidadAgua = 0; //sumaCalidadAgua es para sumar las calidad de agua de un array de calidad de agua
        for (int i = 0; i < listaCalidadAgua.length; i++) { //ciclo for para recorrer el array de calidad de agua, mientras i sea menor que el tamaño del array de calidad de agua, i++
            sumaCalidadAgua += listaCalidadAgua[i]; //la suma de las calidad de agua se suma a la variable sumaCalidadAgua que recorre el array de calidad de agua y se le asigna a la variable sumaCalidadAgua 
            if (listaCalidadAgua[i] < menorCalidadAgua) { //mientras la posición listacalidadagua[i] sea menor que la variable menorCalidadAgua, se asigna a la variable menorCalidadAgua la posición listacalidadagua[i]
                menorCalidadAgua = listaCalidadAgua[i];
            }
        }
        promedio[0] = sumaCalidadAgua/listaCalidadAgua.length; //se divide la suma de las calidad de agua entre el tamaño del array de calidad de agua para obtener el promedio de las calidad de agua
        promedio[1] = menorCalidadAgua; //se asigna la variable menorCalidadAgua a la posición 0 del array promedio, según el recorrido del array de calidad de agua
        promedio[2] = mayorCalidadAgua; //asigno al array promedio la posición 2 la variable mayorCalidadAgua, según el recorrido del array de calidad de agua
        return promedio; //retorno el array promedio con el promedio de calidad de agua, el menor valor y el mayor valor de calidad de agua 5
    }
    
}
