package mvcjava.main;

import mvcjava.db.Consultas;

public class Lanzadora {
    //pulblic main consultas = new consulta();
    public static void main(String[] args) {
        
        Consultas insert = new Consultas();
        insert.insertVendedores();
        Consultas update = new Consultas();
        update.updateVendedores();
        Consultas delete = new Consultas();
        delete.deleteVendedores();
        Consultas consultas = new Consultas();
        consultas.Consulta();
 
        
    }

    //insert 
    

    //update
    
}
