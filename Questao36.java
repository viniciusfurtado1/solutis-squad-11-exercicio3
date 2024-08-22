import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                System.out.print("Digite a quantidade de números a serem sorteados: ");
                int quantidade = scanner.nextInt();

                System.out.print("Digite o valor mínimo da faixa: ");
                int minimo = scanner.nextInt();

                System.out.print("Digite o valor máximo da faixa: ");
                int maximo = scanner.nextInt();

                System.out.println("\nNúmeros sorteados:");

                for (int i = 0; i < quantidade; i++) {
                    int numeroSorteado = random.nextInt((maximo - minimo) + 1) + minimo;
                    System.out.println(numeroSorteado);
                }
                scanner.close();
    }
}
