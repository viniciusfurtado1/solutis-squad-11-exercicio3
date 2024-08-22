import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int[] ultimoDia = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mes = scanner.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido.");
        } else {

            if (dia < 1 || dia > ultimoDia[mes - 1]) {
                System.out.println("Dia inválido para o mês de " + meses[mes - 1] + ".");
            } else {
                System.out.println("Data válida: " + dia + " de " + meses[mes - 1] + ".");
            }
        }
        String trimestre;
        if (mes >= 1 && mes <= 3) {
            trimestre = "1º trimestre";
        } else if (mes >= 4 && mes <= 6) {
            trimestre = "2º trimestre";
        } else if (mes >= 7 && mes <= 9) {
            trimestre = "3º trimestre";
        } else {
            trimestre = "4º trimestre";
        }
        
        System.out.println("Você nasceu no " + trimestre + ".");

        scanner.close();
    }
}
