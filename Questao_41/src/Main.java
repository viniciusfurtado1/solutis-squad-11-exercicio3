import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int palpite;
        // gera um número aleatório de 1 à 100
        int num = ThreadLocalRandom.current().nextInt(1, 101);

        do {
            do {
                System.out.println("Digite um número de 0 a 100: ");
                palpite = scanner.nextInt();
            } while (palpite < 0 || palpite > 100);

            tentativas++;
            if (palpite < num) {
                System.out.println(palpite + " é MENOR do que o número secreto.");
            } else if (palpite > num) {
                System.out.println(palpite + " é MAIOR do que o número secreto.");
            }
        } while (palpite != num);
        scanner.close();

        System.out.println("\nVocê chegou ao número secreto " + num + " em " + tentativas + " tentativas.");

    }
}