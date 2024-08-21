package lista3.questao_12;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiraNota = scanner.nextDouble();
        double segundaNota = scanner.nextDouble();
        double terceiraNota = scanner.nextDouble();

        double mediaPrimeiraUnidade = (primeiraNota + segundaNota) / 2;
        double mediaSegundaUnidade = (segundaNota + terceiraNota) / 2;
        double mediaFinal = (mediaPrimeiraUnidade + mediaSegundaUnidade) / 2;

        if(mediaFinal >= 7.0) {
            System.out.println("Aprovado!");
        } else if(mediaFinal >= 5.0 && mediaFinal < 7.0) {
            System.out.println("Recuperacao...");
        } else {
            System.out.println("Reprovado.");
        }

        System.out.printf("\nSua media da primeira unidade foi: %.2f" +
                "\nSua media da segunda unidade foi: %.2f" +
                "\nMedia final: %.2f", mediaPrimeiraUnidade, mediaSegundaUnidade, mediaFinal);

        scanner.close();
    }
}
