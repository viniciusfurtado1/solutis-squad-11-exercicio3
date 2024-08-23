import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Insira a sua idade.");
		
		idade = sc.nextInt();
		
		if(idade < 16) System.out.println("Você não pode votar.");
		else if((idade >= 16 && idade < 18) || idade >= 65)
			System.out.println("O seu voto é facultativo.");
		
		else System.out.println("O seu voto é obrigatório.");
		
		sc.close();

	}

}
