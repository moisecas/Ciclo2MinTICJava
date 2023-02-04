package clasesObjetos;

public class metodos {
        //atributos 
        int a; 
        int b;


        //constructor vacio
        public metodos() {// public es un modificador de acceso, metodos es el nombre del constructor
            System.out.println("Se ha creado un constructor vacio"); 
        }

        //sobrecarga de constructores 
        public metodos(int a, int b) { //se definen los argumentos que recibe el constructor
            this.a = a; //se asigna el valor del argumento a la variable a
            this.b = b; //se asigna el valor del argumento a la variable b
            System.out.println("Se ha creado un constructor con argumentos");
        }


        //métodos
        public void sumar() { //public es un modificador de acceso, void es un tipo de dato que indica que el método no retorna un valor
            int resultado = a + b; 
            System.out.println("El resultado de la suma es: " + resultado);
        }

        public int sumardos() { //método que retorna un valor
            int resultado = a + b; 
            return resultado;
        }

        //metodo que recibe argumentos
        public int sumarTres(int a, int b) { //se definen los argumentos que recibe el método
            this.a = a; //se asigna el valor del argumento a la variable a
            this.b = b; //se asigna el valor del argumento a la variable b
            return this.sumardos(); //se llama al método sumardos y se retorna el valor  
            //this es una referencia al objeto actual, se usa para acceder a los atributos y métodos del objeto actual
        
        }
    
}
