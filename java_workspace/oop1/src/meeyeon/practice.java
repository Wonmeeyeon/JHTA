package meeyeon;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int input = sc.nextInt();
		int[] inputN = new int[3000];
		
		int total = 0;
		
		for(int i=1; i<=inputN.length+1; i++) {
			if (input/i ==0) {
				total+=i;
			}
			System.out.println(total);
		}
	}

}
