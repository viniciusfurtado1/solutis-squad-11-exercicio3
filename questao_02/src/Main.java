package questao_02.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double salarioMinimo;
        double quantidadeSalariosMinimos;

        System.out.print("Digite o seu salario: ");
        salario = input.nextDouble();

        System.out.print("Digite o salario minimo atual: ");
        salarioMinimo = input.nextDouble();

        quantidadeSalariosMinimos = salario / salarioMinimo;

        System.out.printf("A quantidade de salarios minimos que voce recebe eh: %.2f", quantidadeSalariosMinimos);
    }
}