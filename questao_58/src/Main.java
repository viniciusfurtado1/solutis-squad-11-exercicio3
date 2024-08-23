package questao_58.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalDate data;
		
		System.out.print("Digite uma data - Exemplo: 05/12/2004 - ");		
		data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("Digite uma quantidade de dias: ");
		
		data = data.plusDays(sc.nextLong());
		System.out.println("Nova data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		sc.close();		
		
		}
	
}
