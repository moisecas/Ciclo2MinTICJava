package reto4_tienda;

import java.util.ArrayList;

public class Solution {
    //retorna un array de object [promedio, nombre cliente menos pago, total pagado mas bajo, cliente que mas pago, total pagado mas alto]
    public static Object [] reporte(ArrayList <Cliente> tienda){
        Object [] reportes = new Object[5]; //array de object [promedio, nombre cliente menos pago, total pagado mas bajo, cliente que mas pago, total pagado mas alto]
        double promedio = 0; //promedio de los pagos de los clientes se inicia en 0 debido a que sumaremos los pagos de los clientes y luego dividiremos por la cantidad de clientes
        double menorPago = 0; //menor pago de los clientes se inicia en 0 para que no se pueda comparar con un valor que no existe
        double mayorPago = 0; //mayor pago de los clientes se inicia en 0 debido a que guardara el pago de un cliente que llegue
        String nombreClienteMenorPago = ""; //nombre del cliente con menor pago se inicia en vacio pues se llenará con el nomb
        
        String nombreClienteMasPago = ""; //nombre del cliente con mas pago se inicia en vacio pues se llenará con el nomb
        int totalPagoMasBajo = 0; //total pagado mas bajo se inicia en 0 debido a que guardara el pago de un cliente que llegue
        int totalPagoMasAlto = 0; //total pagado mas alto se inicia en 0 debido a que guardara el pago de un cliente que llegue
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
