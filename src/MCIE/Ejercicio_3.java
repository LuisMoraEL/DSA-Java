package MCIE;

public class Ejercicio_3 {
    public static void main(String[] args) {
        char[] c = {'a', 'd', 'a', 'a', 'f', 'a', 'g', 'r', 'r', 'a', '0'};
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "_");
        }
        System.out.println("\n Concurrencias aisladas de a");
        int countA = 0;
        char current, before, after;

        for (int i = 0; i < c.length; i++) {
            current = c[i];
            if (current == '0') break;
            after = c[i+1];
            before = (i > 0) ? c[i-1] : ' ';
            if (current == 'a' && after != 'a' && before != 'a')
                ++countA;
        }
        System.out.println("countA = " + countA);
    }
}
