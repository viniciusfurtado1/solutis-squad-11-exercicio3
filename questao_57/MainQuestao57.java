package questao_57;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class MainQuestao57 {
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe duas datas e mostraremos as datas entre elas");
        LocalDate firstDate = promptDate(scanner, "primeira");
        LocalDate secondDate = promptSecondDate(scanner, "segunda", firstDate);

        printDates(firstDate, secondDate);

        scanner.close();
    }

    private static void printDates(LocalDate startDate, LocalDate endDate) {
        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        String parsedStartDate = formatDateToString(startDate);
        String parsedEndDate = formatDateToString(endDate);

        System.out.printf("%nMostrando as datas entre %s e %s:%n", parsedStartDate, parsedEndDate );
        for(int i = 0; i <= numOfDaysBetween; i++) {
            LocalDate date = startDate.plusDays(i);

            String parsedDate = date.format(DTF);
            System.out.println(parsedDate);
        }

    }

    private  static LocalDate promptSecondDate(Scanner scanner, String order, LocalDate firstDate) {
        while (true) {
            LocalDate secondDate = promptDate(scanner, order);

            if(firstDate.isBefore(secondDate)) {
                return secondDate;
            }

            System.out.print("A segunda data tem que ser maior que a primeira! ");
        }
    }

    private static LocalDate promptDate(Scanner scanner, String order) {
        while (true) {
            System.out.printf("Digite a %s data (dd/mm/yyyy): ", order);
            String date = scanner.next();

            try {
                return formatStringToDate(date);
            } catch (Exception e) {
                System.out.print("Formato inválido! ");
            }
        }
    }

    private static LocalDate formatStringToDate(String date) {
        return LocalDate.parse(date, DTF);
    }

    private static String formatDateToString(LocalDate date) {
        return date.format(DTF);
    }
}
