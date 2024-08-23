import java.util.Scanner;

public class Main {
    public static boolean numeroPrimo(int N) {
        if (N <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        num = sc.nextInt();

        if (numeroPrimo(num)) {
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("O número " + num + " não é primo.");
        }
    }

}