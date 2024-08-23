import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, qtdPessoas, somaIdade, maiorIdade, menorIdade, maiores18;
        double mediaIdades;
        maiores18 = somaIdade = 0;
        maiorIdade = Integer.MIN_VALUE;
        menorIdade = Integer.MAX_VALUE;

        do {
            System.out.println("Digite a quantidade de pessoas: ");
            qtdPessoas = scanner.nextInt();
            if (qtdPessoas <= 0) {
                System.out.println("Quantidade inválida.\n");
            }
        } while (qtdPessoas <= 0);

        for (int i = 0; i < qtdPessoas; i++) {
            do {
                System.out.println("Digite a idade da " + (i + 1) + "a pessoa: ");
                idade = scanner.nextInt();
                if (idade < 0) {
                    System.out.println("Idade inválida.\n");
                }
            } while (idade <= 0);

            somaIdade += idade;

            if (idade > maiorIdade) { maiorIdade = idade; }
            if (idade < menorIdade) { menorIdade = idade; }

            if (idade >= 18) { maiores18++; }
        }

        scanner.close();

        mediaIdades = (double) somaIdade / qtdPessoas;

        System.out.println("\nA média das idades é: " + mediaIdades);
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
        System.out.println("Quantidade de pessoas maiores de idade: " + maiores18);

    }
}