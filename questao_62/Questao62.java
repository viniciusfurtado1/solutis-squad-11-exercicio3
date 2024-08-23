package questao_62;

import java.util.Scanner;

public class Questao62 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas da pirâmide: ");
        int quantidadeDeLinhas = scanner.nextInt();

        for(int i = 1; i <= quantidadeDeLinhas; i++) {
            for(int j = 1; j <= i; j++) {
                if(i < 10) System.out.printf("0%s ", i);
                else System.out.printf("%s ", i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
