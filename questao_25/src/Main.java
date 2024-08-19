import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;

        System.out.print("Digite as horas: ");
        horas = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        minutos = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        segundos = scanner.nextInt();

        if (horas >= 0 && horas <= 23 &&
                minutos >= 0 && minutos <= 59 &&
                segundos >= 0 && segundos <= 59) {
            System.out.println("O horario eh valido.");
        } else {
            System.out.println("O horario eh invalido.");
        }
    }
}