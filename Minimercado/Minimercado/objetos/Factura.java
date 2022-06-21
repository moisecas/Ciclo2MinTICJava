/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimercado.objetos;

import java.util.ArrayList;
import java.util.Date;

public class Factura {

    public Date fecha;
    public int consecutivo;
    public Double totalFactura;
    Cliente objCliente;
    ArrayList<Pedidos> arrayPedido;

    public Factura(Date fecha, int consecutivo, Double totalFactura, Cliente objCliente, ArrayList<Pedidos> arrayPedido) {
        this.fecha = fecha;
        this.consecutivo = consecutivo;
        this.totalFactura = totalFactura;
        this.objCliente = objCliente;
        this.arrayPedido = arrayPedido;
    }
}
