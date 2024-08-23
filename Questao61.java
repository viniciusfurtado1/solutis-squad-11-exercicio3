import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String piramide = "*";

        System.out.print("Informe a quantidade de linhas da pirâmide: ");
        int quantidadeDeLinhas = scanner.nextInt();

        for(int i = 1; i <= quantidadeDeLinhas; i++) {
            System.out.print(piramide.repeat(i));
            System.out.println();
        }

        scanner.close();
    }
}
