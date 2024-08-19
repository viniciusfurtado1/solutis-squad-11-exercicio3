import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char genero;
        int idade;
        int homensMaiorIdade = 0;
        int mulheresMaiorIdade = 0;

        for (int i = 1; i <= 200; i++) {
            System.out.print("Digite o gênero (M/F): ");
            genero = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            if (idade >= 18) {
                if (genero == 'M') {
                    homensMaiorIdade++;
                } else if (genero == 'F') {
                    mulheresMaiorIdade++;
                } else {
                    System.out.println("Genero invalido");
                }
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + homensMaiorIdade);
        System.out.println("Quantidade de mulheres maiores de idade: " + mulheresMaiorIdade);
    }
}