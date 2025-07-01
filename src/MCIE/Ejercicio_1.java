package MCIE;
/*
Realizar un programa que permita obtener el resultado la siguiente serie:
        1**3+2**3+3**3+...+𝑛**3
*/

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 - MCIE");
        Scanner key = new Scanner(System.in);

        System.out.print("Ingrese el indice a obtener: ");
        int index = key.nextInt();
        System.out.println("index = " + index);

        for (int i = 1; i <= index; i++) {
            System.out.println(i + " = " + Math.pow(i, 3));
        }
    }
}
