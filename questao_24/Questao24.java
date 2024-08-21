package lista3.questao_24;

import java.util.Scanner;

public class Questao24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Informe o mes: ");
        int mes = scanner.nextInt();

        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();

        String resultado = validarData(dia, mes, ano) ? "Data valida!" : "Data invalida.";
        System.out.println(resultado);
        scanner.close();
    }

    public static boolean validarData(int dia, int mes, int ano) {
        if(mes < 1 || mes > 12) return false;
        else return dia >= 1 && dia <= diasDoMes(mes, ano);
    }

    public static int diasDoMes(int mes, int ano) {
        return switch (mes) {
            case 2 -> (ehAnoBissexto(ano)) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public static boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
