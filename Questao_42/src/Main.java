import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final int tam = 3;
        int i, j;
        int[] palpite = new int[tam];

        for (i = 0; i < 40; i++) {
            for (j = 0; j < tam; j++) { palpite[j] = ThreadLocalRandom.current().nextInt(0, 60); }
            Arrays.sort(palpite);
            System.out.println("Grupo " + (i+1) + ": " + Arrays.toString(palpite));
        }
    }
}