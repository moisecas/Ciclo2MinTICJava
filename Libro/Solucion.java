package Libro;

import java.util.ArrayList;
public class Solucion {
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reporte(ArrayList<LibroDigital> library){
        //retorna un array object reporte         //reporte[0] = nombre libro con mas paginas string
        //reporte[1] = cantidad de libro con mas paginas int         //reporte[2] = nombre libro con menos prestamos string
        //reporte[3] = cantidad prestamos libro menos prestados int         //reporte[4] = nombre libro mayor transferencia de datos string
        //reporte[5] =  cantidad de datos transferidos en los préstamos del libro anterior double 
        
        int mayorPaginas = 0;
        int menorPrestamos = 0;
        int mayorTransferencia = 0;
        double mayorTransferenciaDatos = 0;
        String nombreLibroMayorPaginas = "";
        String nombreLibroMenorPrestamos = "";
        String nombreLibroMayorTransferencia = "";

        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getNumeroPaginas() > mayorPaginas) {
                mayorPaginas = library.get(i).getNumeroPaginas();
                nombreLibroMayorPaginas = library.get(i).getTitulo();
            }
            if (library.get(i).getPrestamos() < menorPrestamos) {
                menorPrestamos = library.get(i).getPrestamos();
                nombreLibroMenorPrestamos = library.get(i).getTitulo();
            }
            if (library.get(i).getTransferenciaDatos() > mayorTransferenciaDatos) {
                mayorTransferenciaDatos = library.get(i).getTransferenciaDatos();
                nombreLibroMayorTransferencia = library.get(i).getTitulo();
            } 

            



        




        
        
        
    }
    
}
