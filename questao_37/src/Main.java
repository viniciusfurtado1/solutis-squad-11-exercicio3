package questao_37.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int fatorial;

        System.out.print("Digite um numero: ");
        numero = input.nextInt();

        fatorial = calcularFatorial(numero);

        System.out.println("O fatorial do numero é: " + fatorial);

    }

    private static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}