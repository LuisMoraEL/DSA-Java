package MCIE;

/*
Problema 5.
Escribir una función que tome de entrada un arreglo de enteros, y su tamaño, y que invierta el
orden de los números contenidos en el arreglo, escribiendo el resultado en el mismo arreglo, y
sin usar arreglo auxiliar. Por ejemplo, al pasar de entrada el arreglo: 15298
este mismo arreglo contendrá al salir de la función: 89251
 */

public class Ejercicio_5 {
    public static void main(String[] args) {
        int[] arrayNums = {1, 5, 2, 9, 8};
        System.out.println("Array original");
        for (int num : arrayNums)
            System.out.print(num + "\t");
        System.out.println("\n Array despues de la función");

        // No se usa un array auxiliar
        arrayNums = invertArray(arrayNums);

        for (int num : arrayNums)
            System.out.print(num + "\t");
    }

    public static int[] invertArray(int[] data, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                int temp = data[j+1];
                data[j+1] = data[j];
                data[j] = temp;
            }
        }
        return data;
    }

    public static int[] invertArray(int[] data) {
        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
        return data;
    }
}
