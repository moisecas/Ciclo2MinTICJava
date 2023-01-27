package condicionales;

public class whiles {
    public static void main (String args[]){
        var contador = 0; 

        while (contador < 3){ //
            System.out.println("contador = " + contador);
            contador++; 
        }

         //do while 
        var contadors = 0; 
        do{
            //instrucciones
            System.out.println("contador = " + contador);
            contador++; //control del incremento de la variable
        }while(contadors < 3);  //condición 

    }

   

    


}
