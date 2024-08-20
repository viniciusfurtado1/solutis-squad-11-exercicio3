package questao_55;

import java.util.Scanner;

public class MainQuestao55 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhonePlan phonePlan = new PhonePlan();

        while (true) {
            CallType callType = promptTypeCall(scanner);
            int qtyMinutes = promptQtyMinutes(scanner);

            phonePlan.newCall(callType, qtyMinutes);

            printReportPlan(phonePlan);

            char confirm = promptToContinue(scanner);

            if(confirm == 'n') {
                break;
            }
        }

        printReportPlan(phonePlan);

        scanner.close();
    }

    private static void printReportPlan(PhonePlan phonePlan) {
        System.out.printf("%n----------------------------------------%n");
        System.out.printf("Saldo de minutos restante: %d minuto(s)%n", phonePlan.getMonthlyMinutesQuota());
        System.out.printf("Saldo extras de minutos para Vai vai restante: %d minuto(s)%n", phonePlan.getExtraMinutesToVaiVai());
        System.out.printf("Valor a pagar: %.2f", phonePlan.getMonthlyCost());
        System.out.printf("%n----------------------------------------%n");
    }

    private static int promptQtyMinutes(Scanner scanner) {
        while (true) {
            System.out.print("Digite a quantidade de minutos: ");
            if (scanner.hasNextInt()) {
                int minutes = scanner.nextInt();

                if(minutes > 0) {
                    return minutes;
                }

                System.out.println("Quantidade de minutos tem que ser maior que 0");
            } else {
                System.out.print("Valor inválido! ");
            }
        }
    }

    private static CallType promptTypeCall(Scanner scanner) {
        System.out.printf("Opções de tipo de ligação:%n" +
                "O para outra operações%n" +
                "V para Vai-Vai%n" +
                "F para telefone fixo%n");

        while (true) {
            System.out.print("Escolha o tipo de ligação: ");
            char type = Character.toLowerCase(scanner.next().charAt(0));

            CallType callType = CallType.fromChar(type);

            if(callType != null) {
                return callType;
            }

           System.out.print("Tipo de ligação inválido! ");
        }
    }

    private static char promptToContinue(Scanner scanner) {
        char isOutsourced;

        while(true) {
            System.out.print("Deseja realizar mais uma ligação?(s ou n): ");
            isOutsourced = Character.toLowerCase(scanner.next().charAt(0)) ;

            if( isOutsourced == 'n' || isOutsourced == 's') {
                break;
            }
            System.out.print("Selecione S para continuar ou N para sair! ");
        }
        return isOutsourced;
    }

}
