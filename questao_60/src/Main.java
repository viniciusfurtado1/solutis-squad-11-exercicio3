import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor inicial da divida: ");
        double dividaInicial = input.nextDouble();

        System.out.print("Taxa de correcao mensal (em %): ");
        double taxaCorrecao = input.nextDouble() / 100;

        System.out.print("Quantidade de anos: ");
        int anos = input.nextInt();

        System.out.println("Mês/Ano\t\tValor da Dívida");

        double valorDivida = dividaInicial;
        int ano = 2007;

        for (int i = 0; i < anos; i++) {
            for (int mes = 1; mes <= 12; mes++) {
                System.out.println(mes + "/" + ano + "\t\tR$" + String.format("%.2f", valorDivida));
                valorDivida += valorDivida * taxaCorrecao;
            }
            ano++;
        }
    }
}