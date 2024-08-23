package questao_7;

import java.util.Scanner;
public class MainQuestao7 {
    private final static double COMMISSION_RATE = 0.10; // 10%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double customerBill = promptCustomerBill(scanner);

        double waiterCommission = calculateCommission(customerBill);

        printWaiterCommission(waiterCommission);

        scanner.close();
    }

    private static double calculateCommission(double customerBill) {
        return customerBill * COMMISSION_RATE;
    }

    private static void printWaiterCommission(double totalCommission) {
        System.out.printf("A comissão do garçom é de: %.2f", totalCommission);
    }

    private static double promptCustomerBill(Scanner scanner) {
        while (true) {
            System.out.print("Digite valor das despesas do cliente: ");
            if (scanner.hasNextDouble()) {
                double billAmount = scanner.nextDouble();

                if(billAmount > 0) {
                    return billAmount;
                }

                System.out.print("Valor tem que ser maior que zero! ");
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }

    }

}
