import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, maior;

        System.out.println("Informe o primeiro numero: ");
        n1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        n2 = scanner.nextInt();

        System.out.println("Informe o terceiro numero: ");
        n3 = scanner.nextInt();
        scanner.close();

        if (n1 == n2 && n2 == n3) {
            System.out.println("Os números são iguais.");
        } else {
            maior = Math.max(n1, Math.max(n2, n3));
            System.out.println("O maior número é: " + maior);
        }
    }
}