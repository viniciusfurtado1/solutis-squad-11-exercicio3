import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd;
        do {
            System.out.println("Determine a quantidade de linhas: ");
            qtd = scanner.nextInt();
            if (qtd < 1) {
                System.out.println("Quantidade inválida.\n");
            }
        } while (qtd < 1);

        for (int i = 0; i < qtd; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(String.format("%02d", j+1) + " ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}