import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a data (formato dd/MM/yyyy): ");
        String dataInput = scanner.nextLine();

        LocalDate data = LocalDate.parse(dataInput, formatoData);

        System.out.print("Digite a quantidade de dias a ser somada: ");
        int dias = scanner.nextInt();

        LocalDate novaData = data.plusDays(dias);

        System.out.println("A nova data é: " + novaData.format(formatoData));

        scanner.close();

    }
}
