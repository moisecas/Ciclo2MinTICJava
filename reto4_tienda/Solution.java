package reto4_tienda;

import java.util.ArrayList;

public class Solution {
    //retorna un array de object [promedio, nombre cliente menos pago, total pagado mas bajo, cliente que mas pago, total pagado mas alto]
    public static Object [] reporte(ArrayList <Cliente> tienda){
        Object [] reportes = new Object[5]; //array de object [promedio, nombre cliente menos pago, total pagado mas bajo, cliente que mas pago, total pagado mas alto]
        double promedio = 0; //promedio de los pagos de los clientes se inicia en 0 debido a que sumaremos los pagos de los clientes y luego dividiremos por la cantidad de clientes
        double menorPago = tienda.get(0).getTotalAPagar(); //el menor pago inicia en el primer pago de la tienda
        double mayorPago = tienda.get(0).getTotalAPagar(); //el mayor pago inicia en el primer pago de la tienda
        
        String nombreClienteMenorPago = tienda.get(0).getNombreCompleto(); //el nombre del cliente menos pago inicia en el nombre del primer cliente
        
        String nombreClienteMasPago = tienda.get(0).getNombreCompleto(); //el nombre del cliente que mas pago inicia en el nombre del primer cliente



        int totalPagoMasBajo = Integer .MAX_VALUE; //el total pagado mas bajo inicia en el valor maximo de int
        int totalPagoMasAlto =  Integer .MIN_VALUE; //el total pagado mas alto inicia en el valor minimo de int

        for (int i = 0; i < tienda.size(); i++) { //recorre el array de clientes
            promedio += tienda.get(i).getTotalAPagar(); //suma el total pagado de cada cliente
            if (tienda.get(i).getTotalAPagar() < menorPago) { //si el total pagado de un cliente es menor al menor pago
                menorPago = tienda.get(i).getTotalAPagar(); //guarda el total pagado de un cliente que llegue
                nombreClienteMenorPago = tienda.get(i).getNombreCompleto(); //guarda el nombre del cliente con menor pago
            }
            if (tienda.get(i).getTotalAPagar() > mayorPago) { //si el total pagado de un cliente es mayor al mayor pago
                mayorPago = tienda.get(i).getTotalAPagar(); //guarda el total pagado de un cliente que llegue
                nombreClienteMasPago = tienda.get(i).getNombreCompleto(); //guarda el nombre del cliente con mas pago
            }
            if (tienda.get(i).getTotalAPagar() > totalPagoMasAlto) { //si el total pagado de un cliente es mayor al total pagado mas alto
                totalPagoMasAlto = tienda.get(i).getTotalAPagar(); //guarda el total pagado de un cliente que llegue
                nombreClienteMasPago = tienda.get(i).getNombreCompleto(); //guarda el nombre del cliente con mas pago
            }
            if (tienda.get(i).getTotalAPagar() < totalPagoMasBajo) { //si el total pagado de un cliente es menor al total pagado mas bajo
                totalPagoMasBajo = tienda.get(i).getTotalAPagar(); //guarda el total pagado de un cliente que llegue
            }
            //retorno
            
        }
        reportes[0] = promedio / tienda.size(); //promedio de los pagos de los clientes
        reportes[1] = nombreClienteMenorPago; //nombre
        reportes[2] = totalPagoMasBajo; //total pagado mas bajo
        reportes[3] = nombreClienteMasPago; //nombre
        reportes[4] = totalPagoMasAlto; //total pagado mas alto
        return reportes; //retorna el array de object [promedio, nombre cliente menos pago, total pagado mas bajo, cliente que mas pago, total pagado mas alto]
       
    } 
        


}
