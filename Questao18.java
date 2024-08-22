import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Meses com seus respectivos dias máximos
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Receber o número do dia e do mês
        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mes = scanner.nextInt();

        // Verificar se o mês é válido
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido.");
        } else {
            // Verificar se o dia é válido para o mês dado
            if (dia < 1 || dia > diasPorMes[mes - 1]) {
                System.out.println("Dia inválido para o mês de " + meses[mes - 1] + ".");
            } else {
                // Informar a data válida
                System.out.println("Data válida: " + dia + " de " + meses[mes - 1] + ".");

                // Determinar o trimestre
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
              
                String signo = signos(dia, mes);
                System.out.println("Seu signo é: " + signo + ".");
            }
        }
        scanner.close();
    }
    public static String signos(int dia, int mes) {
        switch (mes) {
            case 1:  // Janeiro
                return (dia >= 20) ? "Aquário" : "Capricórnio";
            case 2:  // Fevereiro
                return (dia >= 19) ? "Peixes" : "Aquário";
            case 3:  // Março
                return (dia >= 21) ? "Áries" : "Peixes";
            case 4:  // Abril
                return (dia >= 20) ? "Touro" : "Áries";
            case 5:  // Maio
                return (dia >= 21) ? "Gêmeos" : "Touro";
            case 6:  // Junho
                return (dia >= 21) ? "Câncer" : "Gêmeos";
            case 7:  // Julho
                return (dia >= 23) ? "Leão" : "Câncer";
            case 8:  // Agosto
                return (dia >= 23) ? "Virgem" : "Leão";
            case 9:  // Setembro
                return (dia >= 23) ? "Libra" : "Virgem";
            case 10: // Outubro
                return (dia >= 23) ? "Escorpião" : "Libra";
            case 11: // Novembro
                return (dia >= 22) ? "Sagitário" : "Escorpião";
            case 12: // Dezembro
                return (dia >= 22) ? "Capricórnio" : "Sagitário";
            default:
                return "Signo inválido";
        }
    }
}
