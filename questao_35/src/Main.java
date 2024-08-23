import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, rangeInit, rangeFinal;
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números a ser sorteado.");
		n = sc.nextInt();
		
		System.out.println("Digite o intervalo de números sorteados - Exemplo: 13 25");
		
		rangeInit = sc.nextInt();
		rangeFinal = sc.nextInt();
		
		System.out.println("Números sorteados: ");
		for(int i = 0; i<n; i++) {
			System.out.println(r.nextInt(rangeFinal - (rangeInit - 1))+rangeInit);
		}
		
		sc.close();
	}

}
