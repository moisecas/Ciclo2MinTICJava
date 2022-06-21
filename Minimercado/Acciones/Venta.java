/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acciones;

import Minimercado.objetos.Cliente;
import java.util.ArrayList;
import java.util.Date;
import Minimercado.objetos.Articulos;

import Minimercado.objetos.Factura;
import Minimercado.objetos.Pedidos;

public class Venta {

    public void venta() {
        
        Cliente miCliente = new Cliente("Carlos", "Romero", 33);
        

        //Cliente miCliente = new Cliente("Carlos", "Romero", 33);

        Articulos miArticulo1 = new Articulos("Arroz", 1000);
        Articulos miArticulo2 = new Articulos("Pasta", 2500);
        Articulos miArticulo3 = new Articulos("Carne", 3200);

        ArrayList<Articulos> arrArticulo = new ArrayList<>();
        arrArticulo.add(miArticulo1);
        arrArticulo.add(miArticulo2);
        arrArticulo.add(miArticulo3);

        Pedidos miPedido = new Pedidos(0001, 12345, arrArticulo);

        ArrayList<Pedidos> arrPedido = new ArrayList<>();

        arrPedido.add(miPedido);

        Date fecha = new Date();

        Factura miFactura = new Factura(fecha, 000001, totalFactura(arrPedido), miCliente, arrPedido);
        
        System.out.println("La fecha de esta factura es :: " + miFactura.fecha);
        System.out.println("El toal del pedido es :: " + miFactura.totalFactura);
    }
    
    /*
     Este metodo hae uso de ciclos for para calcular el valor total a pagar por 
     los articulos dentro del pedido.    
    */
    
    public double totalFactura(ArrayList<Pedidos> arrayPedido) {

        double totalPagar = 0;

        for (Pedidos pedido : arrayPedido) {

            for (Articulos articulo : pedido.arrayArticulos) {
                totalPagar += articulo.precio;
            }

        }
        //System.out.println("El Total de la factura es :: " + totalPagar);
        return totalPagar;

    }

}