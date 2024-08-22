import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.print("Digite o valor inicial da dívida: R$ ");
        double divida = scanner.nextDouble();

        System.out.print("Digite a taxa de correção mensal (%): ");
        double taxaCorrecao = scanner.nextDouble() / 100;

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.println("\nEvolução da dívida ao longo dos meses e anos:");

        System.out.print("Ano\t");
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        for (String mes : meses) {
            System.out.print(mes + "\t");
        }
        System.out.println();

        for (int ano = 2007; ano < 2007 + anos; ano++) {
            System.out.print(ano + "\t");
            for (int mes = 0; mes < 12; mes++) {
                // Aplica a taxa de correção ao valor da dívida
                divida += divida * taxaCorrecao;
                System.out.print(df.format(divida) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
