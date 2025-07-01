package MCIE;

/*
Problema 4.
Implemente una función void SumDiagonals(int data[N][M], int result[]) que calcule la suma
de cada una de las diagonales cuya orientación es hacia la derecha y abajo, en la matriz data, y
almacene los resultados en el array result.
Ejemplo: ante la ejecución de la función con la siguiente matriz data:
10 26
12 20 
 −5 4
la función debe almacenar en result el siguiente contenido: {26, 30, 16, −5}.
*/

public class Ejercicio_4 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 26}, {12, 20}, {-5, 4}}; // Matriz de 3x2

        System.out.println("La matriz es la siguiente: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

        int[] result = sumDiagonals(matrix);
        System.out.println("El array de resultado es el siguiente: ");
        for (int num : result)
            System.out.print(num + ", ");
    }

    public static int[] sumDiagonals(int[][] data) {
        int filas = data.length;
        int columnas = data[0].length;
        int totalDiagonales = filas + columnas - 1;

        int[] result = new int[totalDiagonales];
        int index = 0;

        // Diagonales que empiezan en la primera fila (de izquierda a derecha)
        for (int col = 0; col < columnas; col++) {
            int suma = 0;
            int i = 0, j = col;
            while (i < filas && j < columnas) {
                suma += data[i][j];
                i++;
                j++;
            }
            result[index++] = suma;
        }

        // Diagonales que empiezan en la primera columna (desde la fila 1)
        for (int fila = 1; fila < filas; fila++) {
            int suma = 0;
            int i = fila, j = 0;
            while (i < filas && j < columnas) {
                suma += data[i][j];
                i++;
                j++;
            }
            result[index++] = suma;
        }

        return result;
    }
}
