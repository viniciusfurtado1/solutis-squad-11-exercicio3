import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Questao18 {

    public static void main(String[] args) {

        LocalDate dataNascimento, dataAtual = LocalDate.now();
        Scanner sc = new Scanner(System.in);

        int dia, mesNum, ano;
        String[] mes = {"Janeiro", "Fevereiro","Março", "Abril",
                "Maio","Junho", "Julho", "Agosto",
                "Setembro", "Outbro", "Novembro", "Dezembro"};

        System.out.print("Digite um dia: ");
        dia = sc.nextInt();

        System.out.print("Digite um numero correspondente ao mes: ");
        mesNum = sc.nextInt();

        System.out.print("Digite um ano: ");
        ano = sc.nextInt();

        dataNascimento = LocalDate.of(ano, mesNum, dia);

        if(validarData(dia, mesNum)){

            System.out.println("Dia ok");
            System.out.println(mes[mesNum-1]);

            System.out.printf("Você nasceu no %dº trimestre. ", getTrimestre(mesNum));
            System.out.println("Seu signo é " + signos(dia, mesNum));

            Period intervaloTempo = Period.between(dataNascimento, dataAtual);

            System.out.println("Você tem " + intervaloTempo.getYears() + " anos.");


        }
        else System.out.println("Dia invalido");

    }

    public static boolean validarData(int dia, int mes) {
        if(mes < 1 || mes > 12) return false;
        else return dia >= 1 && dia <= diasDoMes(mes);
    }

    public static int diasDoMes(int mes) {
        return switch (mes) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public static int getTrimestre(int mes) {

        if (mes >= 1 && mes <= 3) return 1;
        else if (mes >= 4 && mes <= 6) return 2;
        else if (mes >= 7 && mes <= 9) return 3;
         else return 4;

    }

    public static String signos(int dia, int mes) {
        return switch (mes) {
            case 1 -> (dia >= 20) ? "Aquário" : "Capricórnio";
            case 2 -> (dia >= 19) ? "Peixes" : "Aquário";
            case 3 -> (dia >= 21) ? "Áries" : "Peixes";
            case 4 -> (dia >= 20) ? "Touro" : "Áries";
            case 5 -> (dia >= 21) ? "Gêmeos" : "Touro";
            case 6 -> (dia >= 21) ? "Câncer" : "Gêmeos";
            case 7 -> (dia >= 23) ? "Leão" : "Câncer";
            case 8 -> (dia >= 23) ? "Virgem" : "Leão";
            case 9 -> (dia >= 23) ? "Libra" : "Virgem";
            case 10 -> (dia >= 23) ? "Escorpião" : "Libra";
            case 11 -> (dia >= 22) ? "Sagitário" : "Escorpião";
            case 12 -> (dia >= 22) ? "Capricórnio" : "Sagitário";
            default -> "Signo inválido";
        };
    }

}
