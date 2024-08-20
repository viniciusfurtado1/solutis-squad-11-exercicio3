package questao_28;

import java.util.Arrays;
import java.util.Scanner;

public class MainQuestao28_desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números para ordernar em ordem crescente");

        double firstNumber = getUserInput(scanner);

        double secondNumber = getUserInput(scanner);

        double thridNumber = getUserInput(scanner);

       double[] inputNumbers = sort3NumbersInASCOrder(firstNumber, secondNumber, thridNumber);

       printSortedNumbers(inputNumbers);
    }

    private static double[] sort3NumbersInASCOrder(double n1, double n2, double n3) {
        double first, second, third;

        if((n1 <= n2) && (n1 <= n3)) {
            first = n1;

            if(n2 <= n3) {
                second = n2;
                third = n3;
            } else {
                second = n3;
                third = n2;
            }

        } else if(n2 <= n1 && n2 <= n3) {
            first = n2;

            if(n1 <= n3) {
                second = n1;
                third = n3;
            } else {
                second = n3;
                third = n1;
            }
        } else {
            first = n3;

            if(n1 <= n2) {
                second = n1;
                third = n2;
            } else {
                second = n2;
                third = n1;
            }
        }

        return new double[]{first, second, third};
    }

    private static void printSortedNumbers(double[] numbers) {
        System.out.println();
        System.out.println("Lista em orderm crescente: ");
        Arrays.stream(numbers).forEach(System.out::println);
    }

    private static double getUserInput(Scanner scanner) {
        while (true) {
            System.out.print("Digite um número: ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }
    }
}

