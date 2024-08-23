package questao_19.src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		System.out.print("Digite 2 números: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2) System.out.printf("Números em ordem crescente: %d, %d\n", n2, n1);
		else System.out.printf("Números em ordem crescente: %d, %d\n", n1, n2);
		
		sc.close();

	}

}
