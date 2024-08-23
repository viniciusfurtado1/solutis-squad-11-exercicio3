import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	
	public static int differenceTime(LocalTime t1, LocalTime t2) {
		return Math.abs(
				t1.toSecondOfDay() - t2.toSecondOfDay());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalTime t1, t2;
		
		System.out.println("Digite o horário 1:\nExemplo - 18:30 - 04:25\n");
		t1 = LocalTime.parse(sc.next());
		
		System.out.println("Digite o horário 2: ");
		t2 = LocalTime.parse(sc.next());
		
		System.out.println("Diferença de tempo: " + differenceTime(t1, t2) + " segundos.");
		
		sc.close();
		
	}
}
