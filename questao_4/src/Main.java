import java.util.Scanner;

public class Main {
	
	public static float calculoMedia(float[] notas) {
		
		float soma = 0;
		for(float f : notas) soma += f;
		
		return (soma/4);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float[] notas = new float[4];
		
		for(int i = 0; i < 4; i++) {
			
			System.out.printf("Digite a nota %d: ", i+1);
			notas[i] = sc.nextFloat();
		}
		
		System.out.printf("Média final do aluno: %.1f", 
				calculoMedia(notas));
		
		sc.close();
		
	}
}
