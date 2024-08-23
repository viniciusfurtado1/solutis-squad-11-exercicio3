package questao_39;

import java.util.Scanner;

public class Questao39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        String resultado = ehNumeroPerfeito(numero) ? "Numero perfeito!" : "Nao eh numero perfeito...";
        System.out.println(resultado);
        scanner.close();
    }

    public static boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) somaDivisores += i;
        }

        return somaDivisores == numero;
    }
}
