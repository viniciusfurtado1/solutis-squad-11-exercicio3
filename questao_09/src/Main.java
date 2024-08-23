package questao_09.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        do {
            System.out.println("Informe a idade: ");
            idade = scanner.nextInt();
            if (idade < 0 || idade > 120) {
                System.out.println("Idade inválida.\n");
            }
        } while (idade < 0 || idade > 120);

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        scanner.close();
    }
}