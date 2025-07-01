package MCIE;

public class Ejercicio_7 {
    public static void main(String[] args) {
        System.out.println("¿Qué hace la función?");
        int value = mysterious(30);
        System.out.println("value = " + value);
        System.out.println("R -> Devuelve la cantidad de multiplos de 3 incluyendo el 0");
    }

    public static int mysterious(int n) {
        int i;
        int count = 0;
        for (i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                count+=1;
            }
        }
        return count;
    }
}
