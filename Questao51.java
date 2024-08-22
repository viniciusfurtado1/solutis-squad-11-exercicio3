import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = 1, num2 = 1;


        System.out.println(num1);
        System.out.println(num2);


        for (int i = 3; i <= 50; i++) {
            long proximoNumero = num1 + num2;
            System.out.println(proximoNumero);


            num1 = num2;
            num2 = proximoNumero;
        }
        System.out.print("\nDigite o n-ésimo termo da sequência de Fibonacci que você deseja ver: ");
        int n = scanner.nextInt();

        // Calculando o n-ésimo termo da sequência de Fibonacci
        num1 = 1;
        num2 = 1;

        if (n == 1 || n == 2) {
            System.out.println("O " + n + "º termo da sequência de Fibonacci é: 1");
        } else {
            for (int i = 3; i <= n; i++) {
                long proximoNumero = num1 + num2;
                num1 = num2;
                num2 = proximoNumero;
            }
            System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + num2);
        }
        scanner.close();
    }
}
