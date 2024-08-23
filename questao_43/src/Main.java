package questao_43.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0.0;

        for (int i = 1; i <= 500; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = input.nextDouble();
            soma += valor;
        }

        double media = soma / 500;

        System.out.println("A media aritmética dos 500 valores é: " + media);
    }
}