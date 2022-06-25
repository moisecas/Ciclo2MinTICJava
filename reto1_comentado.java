//metodo double reporte recibe como entrada array double notas y retorna un array double promedio, menor nota y mayor nota de las notas

public class reto1{
    public static double [] reporte (double[]listaNotas){ //metodo double, decimales
        double [] promedio = new double[3]; //declaración de variables double, new double [3] declara un array de 3 posiciones
        double menorNota = listaNotas[0]; //asignano un array de notas a una variable double, empieza en 0 
        double mayorNota = listaNotas[0];//asignano un array de notas a una variable double
        double sumaNotas = 0; //sumaNotas es para sumar las notas de un array de notas
        for (int i = 0; i < listaNotas.length; i++) { //ciclo for para recorrer el array de notas, mientras i sea menor que el tamaño del array de notas, i++
            sumaNotas += listaNotas[i]; //la suma de las notas se suma a la variable sumaNotas que recorre el array de notas y se le asigna a la variable sumaNotas 
            if (listaNotas[i] < menorNota) { //mientras la posición listanotas[i] sea menor que la variable menorNota, se asigna a la variable menorNota la posición listanotas[i]
                menorNota = listaNotas[i];
            }
            if (listaNotas[i] > mayorNota) { //mientras listaNotas[i] sea mayor que la variable mayorNota, se asigna a la variable mayorNota la posición listaNotas[i]
                mayorNota = listaNotas[i];
            }
        }
        promedio[0] = sumaNotas/listaNotas.length; //se divide la suma de las notas entre el tamaño del array de notas para obtener el promedio de las notas
        promedio[1] = menorNota; //se asigna la variable menorNota a la posición 0 del array promedio, según el recorrido del array de notas
        promedio[2] = mayorNota; //asigno al array promedio la posición 2 la variable mayorNota, según el recorrido del array de notas
        return promedio;
    }
}