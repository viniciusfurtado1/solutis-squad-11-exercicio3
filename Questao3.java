import java.util.Scanner;

public class Questao_3 {

        public static void main(String[] args) {

            int homens = 0;
            int mulheres = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("Informe a quantidades de homens");
            homens = scan.nextInt();
            System.out.println("Informe a quantidade de mulheres");
            mulheres = scan.nextInt();

            System.out.printf("Porcentagem Homens: %.2f%c\n",
                    ((float)homens/(homens+mulheres)*100), '%');
            System.out.printf("Porcentagem Mulheres: %.2f%c\n",
                    ((float)mulheres/(homens+mulheres)*100), '%');

            scan.close();

        }
}
