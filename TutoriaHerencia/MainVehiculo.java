package TutoriaHerencia;

public class MainVehiculo {
    public static void main(String[] args) { //creamos una clase main que recibe un array de strings como argumento
        Vehiculo vehiculo = new Vehiculo("Ford", "Fiesta", 12345, "Rojo", 100.0, true); //creamos un objeto de la clase Vehiculo desde el constructor de la clase Vehiculo
        System.out.println(vehiculo.getAtributosString()); //imprimimos los atributos del objeto vehiculo
        vehiculo.vender();  //llamamos al metodo vender del objeto vehiculo
        System.out.println(vehiculo.getAtributosString()); //imprimimos los atributos del objeto vehiculo
    
        Turismo turismo = new Turismo("Ford", "Fiesta", 12345, "Rojo", 100.0, true, 4, true); //creamos un objeto de la clase Turismo desde el constructor de la clase Turismo
        System.out.println(turismo.getAtributos()); //imprimimos los atributos del objeto turismo
    }

    
}
