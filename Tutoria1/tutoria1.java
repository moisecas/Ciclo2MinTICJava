public class tutoria1 {
    public static void main(String[] args) throws Exception {
        int numero_mes = 4;
        String mes = "", estacion = ""; //declaración de variables string
        switch (numero_mes) { //switch para asignar el nombre del mes a la variable mes
            case 1: //paso por instrucciones, case 1 es el numero del mes, si el numero del mes es 1, se asigna el nombre del mes a la variable mes
                mes = "Enero";
                estacion = "invierno";
                break;
            case 2:
                mes = "Febrero";
                estacion = "invierno";
                break;
            case 3:
                mes = "Marzo";
                estacion = "primavera";
                break;
            case 4:
                mes = "Abril";
                estacion = "primavera";
                break;
            case 5:
                mes = "Mayo";
                estacion = "primavera";
                break;
            case 6:
                mes = "Junio";
                estacion = "verano";
                break;
            case 7:
                mes = "Julio";
                estacion = "verano";
                break;
            case 8:
                mes = "Agosto";
                estacion = "verano";
                break;
            case 9:
                mes = "Septiembre";
                estacion = "otoño";
                break;
            case 10:
                mes = "Octubre";
                estacion = "otoño";
                break;
            case 11:
                mes = "Noviembre";
                estacion = "otoño";
                break;
            case 12:
                mes = "Diciembre";
                estacion = "invierno";
                break;
            default: //si no se cumple ninguna condición, se asigna un mensaje de error
                mes = "Mes no encontrado";
                break;
        }
        System.out.println("El mes es " + mes + " y la estación es " + estacion); //imprime el mensaje con el nombre del mes y la estación
        //se debe usar el break para que no se ejecute el resto de instrucciones
        //se debe imprimir el mensaje con el nombre del mes y la estación, variables declaradas en el switch
    }
}
