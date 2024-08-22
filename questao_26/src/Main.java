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
		
		int timeInSeconds = differenceTime(t1, t2);
		
		String timeString = String.format(
				"%02d:%02d:%02d", 
				timeInSeconds/3600,
				(timeInSeconds%3600)/60, 
				timeInSeconds%60
				);
		
		System.out.println("Diferença de tempo: " + timeString);
		
		sc.close();
		
	}
}
