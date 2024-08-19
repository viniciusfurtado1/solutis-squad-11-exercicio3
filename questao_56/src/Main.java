import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String primeiroCandidato;
        String segundoCandidato;
        String terceiroCandidato;
        int votosPrimeiroCandidato = 0;
        int votosSegundoCandidato = 0;
        int votosTerceiroCandidato = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        System.out.print("Digite o nome do primeiro candidato: ");
        primeiroCandidato = input.nextLine();

        System.out.print("Digite o nome do segundo candidato: ");
        segundoCandidato = input.nextLine();

        System.out.print("Digite o nome do terceiro candidato: ");
        terceiroCandidato = input.nextLine();

        int opcao;

        do {
            System.out.println("Em quem voce deseja votar?:");
            System.out.println("1. " + primeiroCandidato);
            System.out.println("2. " + segundoCandidato);
            System.out.println("3. " + terceiroCandidato);
            System.out.println("4. Voto em branco");
            System.out.println("0. Encerrar votação");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                votosPrimeiroCandidato++;
            } else if (opcao == 2) {
                votosSegundoCandidato++;
            } else if (opcao == 3) {
                votosTerceiroCandidato++;
            } else if (opcao == 4) {
                votosEmBranco++;
            }
            if (opcao != 0) {
                totalVotos++;
            }
        } while (opcao != 0);

        double percentualPrimeiroCandidato = (votosPrimeiroCandidato * 100.0) / totalVotos;
        double percentualSegundoCandidato = (votosSegundoCandidato * 100.0) / totalVotos;
        double percentualTerceiroCandidato = (votosTerceiroCandidato * 100.0) / totalVotos;
        double percentualBranco = (votosEmBranco * 100.0) / totalVotos;

        System.out.println("\nResultados da eleicao:");
        System.out.println(primeiroCandidato + ": " + votosPrimeiroCandidato + " votos (" + String.format("%.2f", percentualPrimeiroCandidato) + "%)");
        System.out.println(segundoCandidato + ": " + votosSegundoCandidato + " votos (" + String.format("%.2f", percentualSegundoCandidato) + "%)");
        System.out.println(terceiroCandidato + ": " + votosTerceiroCandidato + " votos (" + String.format("%.2f", percentualTerceiroCandidato) + "%)");
        System.out.println("Votos em branco: " + votosEmBranco + " (" + String.format("%.2f", percentualBranco) + "%)");

        String ganhador;

        if (votosPrimeiroCandidato > votosSegundoCandidato && votosPrimeiroCandidato > votosTerceiroCandidato) {
            ganhador = primeiroCandidato;
        } else if (votosSegundoCandidato > votosPrimeiroCandidato && votosSegundoCandidato > votosTerceiroCandidato) {
            ganhador = segundoCandidato;
        } else if (votosTerceiroCandidato > votosPrimeiroCandidato && votosTerceiroCandidato > votosSegundoCandidato) {
            ganhador = terceiroCandidato;
        } else {
            ganhador = "Empate";
        }

        System.out.println("\nGanhador da eleicao: " + ganhador);
    }
}