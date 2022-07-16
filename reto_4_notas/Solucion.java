import java.util.ArrayList; //importamos la clase ArrayList para poder usarla en el programa
public class Solucion { //declaramos la clase Solucion
    public static Object[] reportes(ArrayList<Estudiante> grupo) { //recibe un ArrayList de Estudiante y devuelve un array de objetos
        //EN ESTE ESPACIO PONER SU LÓGICA
        //método debe retornar un Array de Object donde primera posicion promedio de notas, segunda posicion nombre estudiante menor nota, tercera posición la menor nota, cuarta posición nombre de estudiante con mayor nota, quinta posición irá la mayor nota
        double promedio = 0; //promedio es una variable de tipo double que se inicializa en 0 que sumara las notas de todos los estudiantes
        double menorNota = 0; //menorNota inicia en 0 para comparar con las notas de los estudiantes
        double mayorNota = 0; //mayorNota inicia en 0 para comparar con las notas de los estudiantes
        String nombreMenorNota = ""; //nombrreMenor nota inicia vacio para comparar con el nombre de los estudiantes
        String nombreMayorNota = ""; //nombreMayorNota inicia vacio para comparar con el nombre de los estudiantes

        for (int i = 0; i < grupo.size(); i++) { //for que recorre el ArrayList de Estudiante y suma las notas de todos los estudiantes
            promedio += grupo.get(i).getNota(); //suma las notas de todos los estudiantes, grupo.get(i).getNota() es la nota del estudiante en la posicion i del ArrayList
            if (i == 0) {  //si i es 0, es la primera vez que se recorre el ArrayList, se asigna la nota del estudiante en la posicion i al menorNota
                menorNota = grupo.get(i).getNota(); //asigna la nota del estudiante en la posicion i al menorNota
                mayorNota = grupo.get(i).getNota(); //asigna la nota del estudiante en la posicion i al mayorNota
                nombreMenorNota = grupo.get(i).getNombreCompleto(); //asigna el nombre del estudiante en la posicion i al nombreMenorNota
                nombreMayorNota = grupo.get(i).getNombreCompleto(); //asigna el nombre del estudiante en la posicion i al nombreMayorNota
            } else { // si no es la primera vez que se recorre el ArrayList, se compara la nota del estudiante en la posicion i con el menorNota
                if (grupo.get(i).getNota() < menorNota) { //si la nota del estudiante en la posicion i es menor que el menorNota
                    menorNota = grupo.get(i).getNota(); //asigna la nota del estudiante en la posicion i al menorNota
                    nombreMenorNota = grupo.get(i).getNombreCompleto(); //asigna el nombre del estudiante en la posicion i al nombreMenorNota
                }
                if (grupo.get(i).getNota() > mayorNota) { //si la nota del estudiante en la posicion i es mayor que el mayorNota
                    mayorNota = grupo.get(i).getNota(); //asigna la nota del estudiante en la posicion i al mayorNota
                    nombreMayorNota = grupo.get(i).getNombreCompleto(); //asigna el nombre del estudiante en la posicion i al nombreMayorNota
                } 
            }
        }
        promedio = promedio / grupo.size(); //promedio es el promedio de todos los estudiantes, grupo.size() es el numero de estudiantes que hay en el ArrayList
        return new Object[]{promedio, nombreMenorNota, menorNota, nombreMayorNota, mayorNota};  //retorna un array de objetos con el promedio, nombre del estudiante menor nota, menor nota, nombre del estudiante mayor nota y mayor nota
        
            

            
            

              
                
    }
}
