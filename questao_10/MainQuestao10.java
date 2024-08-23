package questao_10;

import java.util.Scanner;

public class MainQuestao10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String promptGrossSalary = "Digite o salário bruto: ";
        double grossSalary = promptDouble(scanner, promptGrossSalary);

        String promptDiscountAmount = "Digite o valor total dos descontos: ";
        double discountAmount = promptDouble(scanner, promptDiscountAmount);

        String promptLoan = "Digite o valor do empréstimo desejado: ";
        double loan = promptDouble(scanner, promptLoan);

        Client client = new Client(grossSalary, discountAmount);

        client.canLoad(loan);
    }

    private static double promptDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();

                if(value > 0) {
                    return value;
                }

                System.out.print("Valor tem que ser maior que zero! ");
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }

    }
}
