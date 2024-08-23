import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdNotas;
        double porcFaltas, media, nota, somaNotas;
        somaNotas = 0;

        do {
            System.out.println("Digite a quantidade de notas do aluno: ");
            qtdNotas = scanner.nextInt();
            if (qtdNotas <= 0) { System.out.println("Quantidade inválida.\n"); }
        } while (qtdNotas <= 0);

        for (int i = 0; i < qtdNotas; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + "a nota do aluno: ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) { System.out.println("Nota inválida.\n"); }
            } while (nota < 0 || nota > 10);

            somaNotas+=nota;
        }
        System.out.println("Digite a porcentagem de faltas do aluno: ");
        porcFaltas = scanner.nextDouble();

        media = (double)Math.round((somaNotas/qtdNotas)*100)/100;

        System.out.println("\nMédia semestral: " + media);
        System.out.println("Porcentagem de faltas: " + porcFaltas + "%");


        if (media < 7) {
            System.out.println("\nAluno reprovado por média.");
        } else if (porcFaltas > 25) {
            System.out.println("\nAluno reprovado por faltas.");
        } else {
            System.out.println("\nAluno aprovado.");
        }

    }
}
