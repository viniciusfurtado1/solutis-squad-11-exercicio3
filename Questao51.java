import java.util.Scanner;

public class Questao51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Tribonacci: ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("O número de termos deve ser pelo menos 3.");
        } else {
            int t1 = 1, t2 = 1, t3 = 2;
            System.out.print(t1 + " " + t2 + " " + t3 + " ");

            for (int i = 4; i <= n; i++) {
                int nextTerm = t1 + t2 + t3;
                System.out.print(nextTerm + " ");
                t1 = t2;
                t2 = t3;
                t3 = nextTerm;
            }
        }
    }
}
