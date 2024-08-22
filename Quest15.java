import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] mes = {"Janeiro", "Fevereiro","Marco", "Abril", "Maio","Junho", "Julho", "Agosto",
        "Setembro", "Outbro", "Novembro", "Dezembro"};

        System.out.print("Insert a value: ");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        scan.close();

        for (int i = 1; i <= 12; i++) {
            if(mes[i-1].equals(a)){
                System.out.println("O mês informado é: " + i);
            }
        }
    }
}
