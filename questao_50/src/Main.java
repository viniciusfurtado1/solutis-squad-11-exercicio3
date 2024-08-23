package questao_50.src;

import java.util.Scanner;

public class Main {
    public static int fiboN(int n) {
        int f;
        if (n < 3) f = 1;
        else f = fiboN(n-1) + fiboN(n-2);
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indice;

        do {
            System.out.println("Índice do termo Fibonacci: ");
            indice = scanner.nextInt();
            if (indice <= 0) { System.out.println("Índice inválido."); }
        } while (indice <= 0);

        System.out.println("O " + indice + "o termo da sequencia de Fibonacci é: " + fiboN(indice));
    }
}