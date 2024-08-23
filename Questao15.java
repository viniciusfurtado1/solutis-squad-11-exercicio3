import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mesNum;
        String[] mes = {"Janeiro", "Fevereiro","Março", "Abril",
                        "Maio","Junho", "Julho", "Agosto",
                        "Setembro", "Outbro", "Novembro", "Dezembro"};

        System.out.print("Digite um dia: ");
        dia = sc.nextInt();

        System.out.print("Digite um numero correspondente ao mes: ");
        mesNum = sc.nextInt();

        if(validarData(dia, mesNum)){
            System.out.println("Dia ok");
            System.out.println(mes[mesNum-1]);
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
}
