package array;

import java.util.Scanner;

public class ArrayDemo9 {
	public static void main(String[] args) {
		/*
		 *  숫자를 10개 입력받아서 그 중에서 짝수들의 합계만 구해서 출력하기
		 */

		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[105];				
		
		for (int i=0; i<10; i++) {				
			System.out.print("숫자를 입력하세요: ");
			int inputnumber = sc.nextInt();
			
			numbers[i] = inputnumber;			
		}
		int total = 0;
		for (int num : numbers) {
			if(num%2==0) {
				total += num;
			}
		}
		System.out.println("총합: " + total);
		
	}	
	
		

}
