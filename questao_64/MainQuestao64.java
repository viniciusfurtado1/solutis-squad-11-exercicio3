package questao_64;

import java.util.Scanner;

public class MainQuestao64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int size = promptInt(scanner) ;

        for(int i = 1; i <= size; i++) {
          for (int c = 1; c <= i; c ++) {
              String s = "*".repeat(c);
              System.out.println(s);
          }
          System.out.println();
        }
    }

    private static int promptInt(Scanner scanner) {
        while (true) {
            System.out.print("Digite a quantidade de triângulos: ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();

                if(value > 0) {
                    return value;
                }

                System.out.print("Quantidade tem que ser maior do que zero! ");
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }
    }
}
