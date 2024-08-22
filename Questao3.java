import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int homens = 0;
        int mulheres = 0;
        int total = 0;
        float porcH = 0;
        float porcM = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidades de homens");
        homens = scan.nextInt();
        System.out.println("Informe a quantidade de mulheres");
        mulheres = scan.nextInt();
        total = homens + mulheres;
        porcM = (total * mulheres) / 100.f;
        porcH = (total * homens) / 100.f;

        System.out.println("total de alunos na faculdade " + total);
        System.out.println(" Porcentagem Homens " + porcH+ "%");
        System.out.println(" Porcentagem Mulheres " + porcM+ "%");

    }
}




