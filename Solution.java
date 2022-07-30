package reto4_tienda;

import java.util.ArrayList;

public class Solution {
    //metodo main retorna un arraylist en el siguiente orden: promedio, nombre cliente menos pago, total pagado menor, nombre cliente mayor pago, total pagado mayor 
    public static ArrayList<String> retornarArrayList(ArrayList<Cliente> clientes) {
        ArrayList<String> retorno = new ArrayList<String>();
        int promedio = 0;
        int totalPagadoMenor = 0;
        int totalPagadoMayor = 0;
        String nombreClienteMenosPago = "";
        String nombreClienteMayorPago = "";
        for (int i = 0; i < clientes.size(); i++) {
            promedio += clientes.get(i).getTotalAPagar();
            if (i == 0) {
                totalPagadoMenor = clientes.get(i).getTotalAPagar();
                nombreClienteMenosPago = clientes.get(i).getNombreCompleto();
                totalPagadoMayor = clientes.get(i).getTotalAPagar();
                nombreClienteMayorPago = clientes.get(i).getNombreCompleto();
            } else {
                if (clientes.get(i).getTotalAPagar() < totalPagadoMenor) {
                    totalPagadoMenor = clientes.get(i).getTotalAPagar();
                    nombreClienteMenosPago = clientes.get(i).getNombreCompleto();
                }
                if (clientes.get(i).getTotalAPagar() > totalPagadoMayor) {
                    totalPagadoMayor = clientes.get(i).getTotalAPagar();
                    nombreClienteMayorPago = clientes.get(i).getNombreCompleto();
                }
            }
        }
        promedio = promedio / clientes.size();
        retorno.add(String.valueOf(promedio)); //String value of int promedio = promedio / clientes.size(); para que no salga error de casteo
        retorno.add(nombreClienteMenosPago);
        retorno.add(String.valueOf(totalPagadoMenor));
        retorno.add(nombreClienteMayorPago);
        retorno.add(String.valueOf(totalPagadoMayor));
        return retorno; 
    }
   
        


}
