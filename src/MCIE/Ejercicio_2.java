package MCIE;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Ingrese el indice hasta el cual se ha de sumar: ");
        int index = key.nextInt();
        int sumValue = (int) Math.pow(index, 2);
        System.out.println("sumValue = " + sumValue);
    }
}
