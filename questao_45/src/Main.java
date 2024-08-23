package questao_45.src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = new int[100];
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite %d números:", nums.length);
		for(int i = 0; i<nums.length; i++) {
			
			nums[i] = sc.nextInt();
			
		}
		
		Arrays.sort(nums);
		
		System.out.printf("O maior número digitado foi %d.\n", nums[nums.length-1]);
		
		sc.close();

	}

}
