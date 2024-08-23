package questao_22.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia1;
        int mes1;
        int dia2;
        int mes2;

        System.out.print("Digite o dia do primeiro aniversario: ");
        dia1 = scanner.nextInt();

        System.out.print("Digite o mes do primeiro aniversario: ");
        mes1 = scanner.nextInt();

        System.out.print("Digite o dia do segundo aniversario: ");
        dia2 = scanner.nextInt();

        System.out.print("Digite o mes do segundo aniversario: ");
        mes2 = scanner.nextInt();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas de aniversario sao iguais.");
        } else {
            System.out.println("As datas de aniversario são diferentes.");
        }
    }
}