package questao_20;

import java.util.Scanner;

public class MainQuestao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person firstPerson = createPerson(scanner, "primeira");
        Person secondPerson = createPerson(scanner, "segunda");

        compareAgesAndPrint(firstPerson, secondPerson);

        scanner.close();
    }

    private static void compareAgesAndPrint(Person firstPerson, Person secondPerson) {
        if(firstPerson.getAge() == secondPerson.getAge()) {
            System.out.println("Ambas as pessoas tem a mesma idade");
            return;
        }

        if(firstPerson.getAge() > secondPerson.getAge()) {
            System.out.printf("%s é a pessoa mais velha%n", firstPerson.getName());
            System.out.printf("%s é a pessoa mais nova  %n", secondPerson.getName());
            return;
        }

        System.out.printf("%s é a pessoa mais velha%n", secondPerson.getName());
        System.out.printf("%s é a pessoa mais nova%n", firstPerson.getName());
    }

    private static Person createPerson(Scanner scanner, String order) {
        String promptName = String.format("Digite o nome da %s pessoa: ", order);
        String name = promptNameInput(scanner, promptName);

        String promptAge = String.format("Digite a idade da %s pessoa: ", order);
        int age = promptAgeInput(scanner, promptAge);

        return new Person(name, age);
    }

    private static String promptNameInput(Scanner scanner, String prompt) {
        String name;

        while(true) {
            System.out.print(prompt);
            name = scanner.nextLine();

            if(!name.isEmpty()) {
                return name.trim();
            }

            System.out.print("Nome não pode ser vazio! ");
        }
    }

    private static int promptAgeInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                scanner.nextLine();

                if(age > 0) {
                    return age;
                }

                System.out.print("A idade não pode ser negativa! ");
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }
    }
}
