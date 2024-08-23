import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, qt, espacos;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas.");
		
		n = sc.nextInt();
		espacos = n - 1;
		for(int i = 1; i<=n; i++) {
			
			qt = 1 + (i-1)*2;
			for(int j = 1; j <= espacos; j++) System.out.print(" ");
			for(int k = 1; k <= qt; k++) System.out.print("*");
			System.out.println();
			
			espacos--;
		}
		
		sc.close();

	}

}
