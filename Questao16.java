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

        scanner.close();

    }
}
