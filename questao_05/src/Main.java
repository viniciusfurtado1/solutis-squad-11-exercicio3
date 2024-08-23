package questao_05.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double debito;
        double jurosMensais;
        double valorFinalDivida;
        int quantidadeMeses;

        System.out.print("Valor inicial do debito: ");
        debito = input.nextDouble();

        System.out.print("Quantidade de meses: ");
        quantidadeMeses = input.nextInt();

        System.out.print("Juros mensais: ");
        jurosMensais = input.nextDouble();

        valorFinalDivida = debito * (1 + (jurosMensais / 100) * quantidadeMeses);

        System.out.printf("O valor final da dívida é: R$ %.2f", valorFinalDivida);
    }
}