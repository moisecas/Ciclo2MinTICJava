/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimercado.objetos;

import java.util.ArrayList;

public class Pedidos {
   
   public int consecutivo;
   public int clientId ;
   public ArrayList<Articulos> arrayArticulos ;

    public Pedidos(int consecutivo, int clientId, ArrayList<Articulos> arrayArticulos) {
        this.consecutivo = consecutivo;
        this.clientId = clientId;
        this.arrayArticulos = arrayArticulos;
    }

}
