package questao_44;

import java.util.Scanner;

public class Questao44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;

        System.out.println("Informe a quantidade total de valores para a média: ");
        int quantidadeDeValores = scanner.nextInt();

        for (int i = 1; i <= quantidadeDeValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeDeValores;
        System.out.printf("A média aritmética dos %s valores é: %.2f", quantidadeDeValores, media);

        scanner.close();
    }
}
