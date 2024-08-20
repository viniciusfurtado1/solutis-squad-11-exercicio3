package questao_28;

import java.util.Arrays;
import java.util.Scanner;

public class MainQuestao28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputNumbers = getNumbers(3);

        sortNumbersInASCOrder(inputNumbers);

        printSortedNumbers(inputNumbers);

        scanner.close();
    }

    private static double[] getNumbers(int qtyInputs) {
        Scanner scanner = new Scanner(System.in);

        double[] inputNumbers = new double[3];

        System.out.printf("Digite %d números para ordernar em ordem crescente%n", qtyInputs) ;
        for(int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = getUserInput(scanner);
        }

        return inputNumbers;
    }

    private static void sortNumbersInASCOrder(double[] numbers) {
        Arrays.sort(numbers);
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
