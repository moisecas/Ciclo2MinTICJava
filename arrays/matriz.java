package arrays;

public class matriz {
    public static void main(String[] args) {
        int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}}; // Declaramos un array de tipo entero
        System.out.println(matriz[0][0]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[0][1]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[0][2]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[1][0]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[1][1]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[1][2]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[2][0]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[2][1]); // Imprimimos el valor de cada elemento del array recuperados en nombre
        System.out.println(matriz[2][2]); // Imprimimos el valor de cada elemento del array recuperados en nombre

        int [][] matriz2 = new int[3][3]; // Declaramos un array de tipo entero 3x3
        matriz2[0][0] = 1; // Asignamos un valor a cada elemento del array, 1 estara en la posicion [0][0]
        matriz2[0][1] = 2; // Asignamos un valor a cada elemento del array, 2 estara en la posicion [0][1]
        matriz2[0][2] = 3; // Asignamos un valor a cada elemento del array, 3 estara en la posicion [0][2]
        matriz2[1][0] = 4; // Asignamos un valor a cada elemento del array, 4 estara en la posicion [1][0]
        matriz2[1][1] = 5; // Asignamos un valor a cada elemento del array, 5 estara en la posicion [1][1]
        matriz2[1][2] = 6; // Asignamos un valor a cada elemento del array, 6 estara en la posicion [1][2]
        matriz2[2][0] = 7; // Asignamos un valor a cada elemento del array, 7 estara en la posicion [2][0]
        matriz2[2][1] = 8; // Asignamos un valor a cada elemento del array, 8 estara en la posicion [2][1]
        matriz2[2][2] = 9; // Asignamos un valor a cada elemento del array, 9 estara en la posicion [2][2]
        System.out.println(matriz2[0][0]); // Imprimimos el valor de cada elemento del array


        //iterar sobre un array de matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println(matriz2[i][j]);
            }
        }
    }
}
