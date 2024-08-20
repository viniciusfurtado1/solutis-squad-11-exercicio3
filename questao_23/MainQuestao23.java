package questao_23;

import java.time.*;
import java.util.Scanner;

public class MainQuestao23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastrar a primeira pessoa");
        Person firstPerson = createPerson(scanner);

        System.out.println("Cadastrar a segundo pessoa");
        Person secondPerson = createPerson(scanner);

        Person firstBirthdayPerson = findFirstBirthdayBetween2Person(firstPerson, secondPerson);

        printFirstBirthdayPerson(firstBirthdayPerson);

        scanner.close();
    }

    private static void printFirstBirthdayPerson(Person person) {
        if(person == null) {
            System.out.println();
            System.out.println("Ambos fazem aniversário no mesmo dia.");
            return;
        }

        System.out.printf("%n%s faz aniversário primeiro", person.getName());
    }

    private static Person findFirstBirthdayBetween2Person(Person person1, Person person2) {
        MonthDay birthDatePerson1 = person1.getBirthDate();
        MonthDay birthDatePerson2 = person2.getBirthDate();

        if(birthDatePerson1.isBefore(birthDatePerson2)) {
            return person1;
        }

        if(birthDatePerson2.isBefore(birthDatePerson1)) {
            return  person2;
        }

        return null;
    }

    private static Person createPerson(Scanner scanner) {
        String name =  promptNameInput(scanner);

        MonthDay birthDate = promptBirthDate(scanner);

        int day = birthDate.getDayOfMonth();
        int month = birthDate.getMonthValue();

        return new Person(name, day, month);
    }

    private static String promptNameInput(Scanner scanner) {
        String name;

        while(true) {
            System.out.print("Digite o nome do aniversariante: ");
            name = scanner.nextLine();

            if(!name.isEmpty()) {
                return name.trim();
            }

            System.out.print("Nome não pode ser vazio! ");
        }

    }

    private static MonthDay promptBirthDate(Scanner scanner) {
        while (true) {
            String promptDay = "Digite o dia de nascimento: ";
            int day = promptInt(scanner, promptDay);


            String promptMonth = "Digite o mês de nascimento: ";
            int month = promptInt(scanner, promptMonth);

            try {
                return MonthDay.of(month, day);
            } catch (DateTimeException e) {
                System.out.print("Valor de dia ou mês inválido! ");
            }

        }
    }

    private static int promptInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();

                return value;
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }
    }
}


//public static MonthDay getBirthDate(Scanner scanner) {
//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM");
//
//    while (true) {
//        try {
//            System.out.print("Data de Nascimento (dia/mês): ");
//            return MonthDay.parse(scanner.nextLine(), dtf);
//        }catch (DateTimeParseException e) {
//            System.out.print("Formato inválido! ");
//        }
//
//    }
//}
