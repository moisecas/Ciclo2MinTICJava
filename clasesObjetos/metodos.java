package clasesObjetos;

public class metodos {
        //atributos 
        int a; 
        int b;

        //métodos
        public void sumar() {
            int resultado = a + b; 
            System.out.println("El resultado de la suma es: " + resultado);
        }

        public int sumardos() { //método que retorna un valor
            int resultado = a + b; 
            return resultado;
        }
    
}
