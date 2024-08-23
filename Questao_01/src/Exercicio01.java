package Questao_01.src;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nasc, ano, idade;

        do {
            System.out.println("Informe o ano de nascimento: ");
            nasc = scanner.nextInt();
            if (nasc < 0) {
                System.out.println("Ano inválido.\n");
            }
        } while (nasc < 0);
        do {
            System.out.println("Informe o ano atual: ");
            ano = scanner.nextInt();
            if (ano < nasc) {
                System.out.println("Ano inválido.\n");
            }
        } while (ano < nasc);
        scanner.close();

        idade = ano - nasc;
        System.out.println("Idade: " + idade);
    }
}