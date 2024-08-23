package questao_21.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cargo;
        double salario;
        double percentual = 0;
        double valorEmprestimo;

        System.out.print("Digite o seu cargo [Diretoria, Gerencia, Operacional]: ");
        cargo = scanner.nextLine();

        System.out.print("Digite o seu salario: ");
        salario = scanner.nextDouble();

        if (cargo.equalsIgnoreCase("Diretoria")) {
            percentual = 0.30;
        } else if (cargo.equalsIgnoreCase("Gerencia")) {
            percentual = 0.25;
        } else if (cargo.equalsIgnoreCase("Operacional")) {
            percentual = 0.20;
        }

        valorEmprestimo = salario * percentual;

        System.out.printf("O valor do emprestimo possivel para voce é: R$%.2f", valorEmprestimo);
    }
}