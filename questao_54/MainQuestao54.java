package questao_54;

import java.util.Scanner;

public class MainQuestao54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String promptInitialValue = "Digite o valor inicial: ";
        double initialValue = promptDouble(scanner, promptInitialValue);

        String promptFinalValue = "Digite o valor final: ";
        double finalValue = promptFinalValue(scanner, promptFinalValue, initialValue);

        String promptIncrementalValue = "Digite o valor incremental: ";
        double incrementalValue = promptDouble(scanner, promptIncrementalValue);

        String promptRealValue = "Digite em reais o valor de 1 dólar: ";
        double realValue = promptDouble(scanner, promptRealValue);

        printRealToDollarConversionTable(initialValue, finalValue, incrementalValue, realValue);

        scanner.close();
    }

    private static void printRealToDollarConversionTable(
            Double initialValue,
            Double finalValue,
            Double incrementalValue,
            Double realValue
    ) {
        System.out.printf("-----------------------------------------------%n");
        System.out.printf("    Tabela de conversão de reais em dólares    %n");
        System.out.printf("-----------------------------------------------%n");
        System.out.printf("| %-20s | %-20s |%n", "REAIS(R$)", "DÓLARES($)");
        System.out.printf("-----------------------------------------------%n");

        for(double real = initialValue; real <= finalValue; real += incrementalValue) {
            double toDollars = real / realValue;
            String realFormatted = CurrencyFormat.toReal(real);
            String dollarFormatted = CurrencyFormat.toDollar(toDollars);

            System.out.printf("| %-20s | %-20s |%n", realFormatted, dollarFormatted);
        }
    }

    private static double promptFinalValue(Scanner scanner, String prompt, double initialValue) {
        while (true) {
           double finalValue = promptDouble(scanner, prompt);

           if(finalValue > initialValue) {
               return finalValue;
           }

           System.out.print("O valor final não pode ser menor que o valor inicial! ");
        }
    }

    private static double promptDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
               double value = scanner.nextDouble();

               if(value > 0) {
                   return value;
               }

               System.out.print("O valor não pode ser negativo! ");
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }
    }
}
