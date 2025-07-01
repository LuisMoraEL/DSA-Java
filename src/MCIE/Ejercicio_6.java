package MCIE;

/*
Problema 6.
Dada una matriz A de enteros (representada como arreglo bi-dimensional), dar el código para
guardar en un arreglo (uni-dimensional) aquellos elementos de A que sean negativos o nulos, y
calcular el número de dichos elementos.
 */

public class Ejercicio_6 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 6, 0}, {2, 4, -5}, {0, -1, 8}};
        System.out.println("La matriz es la siguiente: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

        // --------------------------------------------------------------------
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] <= 0) count += 1;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] <= 0) {
                    result[index] = matrix[i][j];
                    index++;
                }
            }
        }
        System.out.println("Array resultado: \n Tamaño: " + result.length);
        for (int num : result) {
            System.out.print(num + ", ");
        }
    }
}
