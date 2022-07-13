package Reto4;

import java.util.ArrayList;

public class Solution{
    public static Object [] reporte(ArrayList <Corredor> carrera){
        
       //retorna un array con promedio en llegar a la meta, nombre corredor con menor tiempo en llegar a la meta, menor tiempo a la meta, nombre corredor mayor tiempo en llegar a la meta, mayor tiempo a la meta
        double promedio = 0; //promedio de los tiempos de los corredores se inicia en 0 debido a que sumaremos los tiempos de los corredores y luego dividiremos por la cantidad de corredores
        double menorTiempo = 0; //menor tiempo de los corredores se inicia en 0 para que no se pueda comparar con un valor que no existe
        double mayorTiempo = 0; //mayor tiempo de los corredores se inicia en 0 debido a que guardara el tiempo de un corredor que llegue 
        String nombreCorredorMenorTiempo = ""; //nombre del corredor con menor tiempo se inicia en vacio pues se llenará con el nombre del corredor con menor tiempo
        String nombreCorredorMayorTiempo = ""; //nombre del corredor con mayor tiempo se inicia en vacio pues se llenará con el nombre del corredor con mayor tiempo
        for (int i = 0; i < carrera.size(); i++) { //ciclo que recorre todos los corredores de la carrera, for para arraylist, .size() para saber la cantidad de corredores
            promedio += carrera.get(i).getTiempoMeta(); //sumamos el tiempo de cada corredor a la variable promedio, carrera.get(i).getTiempoMeta() para obtener el tiempo de cada corredor
            if (i == 0) { //si al pasar por i es == 0 entonces es el primer corredor de la carrera, por lo tanto es el menor tiempo
                menorTiempo = carrera.get(i).getTiempoMeta(); //menor tiempo es igual al tiempo del primer corredor de la carrera
                mayorTiempo = carrera.get(i).getTiempoMeta(); //mayor tiempo es igual al tiempo del último corredor de la carrera
                nombreCorredorMenorTiempo = carrera.get(i).getNombreCompleto(); //obtenemos por get el nombre del corredor con menor tiempo
                nombreCorredorMayorTiempo = carrera.get(i).getNombreCompleto(); //obtenemos por get el nombre del corredor con mayor tiempo
            } else { //si no es el primer corredor de la carrera entonces
                if (carrera.get(i).getTiempoMeta() < menorTiempo) { //si el tiempo del corredor actual es menor al menor tiempo entonces
                    menorTiempo = carrera.get(i).getTiempoMeta(); //menor tiempo es igual al tiempo del corredor actual
                    nombreCorredorMenorTiempo = carrera.get(i).getNombreCompleto(); //carrera.get(i).getNombreCompleto() para obtener el nombre del corredor actual, recorre todos los corredores de la carrera
                }
                if (carrera.get(i).getTiempoMeta() > mayorTiempo) { //si el tiempo del corredor actual es mayor al mayor tiempo entonces
                    mayorTiempo = carrera.get(i).getTiempoMeta();
                    nombreCorredorMayorTiempo = carrera.get(i).getNombreCompleto();
                }
            }
        }
        promedio = promedio / carrera.size(); //promedio es igual al promedio de los tiempos de los corredores dividido por la cantidad de corredores
        Object [] reporte = {promedio, nombreCorredorMenorTiempo, menorTiempo, nombreCorredorMayorTiempo, mayorTiempo}; //objeto reporte que contiene los datos del reporte
        return reporte; //retorna el objeto reporte con los datos del reporte de la carrera
        
        
    }
}
