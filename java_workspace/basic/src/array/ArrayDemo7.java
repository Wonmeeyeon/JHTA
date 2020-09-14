package array;

import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		// 숫자를 입력받아서 입력받은 숫자의 총합을 계산하기
		
		// 키보드 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 5개를 입력받는 배열 생성하기
		int[] numbers = new int[5];					//정수 5개 저장하는 배열 생성하기
		
		// 숫자 5번 입력받기
		for (int i=0; i<5; i++) {					//i를 0~4까지 변경하면서 반복하기 
			System.out.print("숫자를 입력하세요: ");
			// 입력받은 숫자를 변수에 저장하기
			int inputnumber = sc.nextInt();
			
			numbers[i] = inputnumber;				// 입력받은 값을 배열의 i번째에 담기
			
			// 변수에 저장된 값을 배열에 담기
		}
		
		//입력받은 숫자들의 총합 계산하기
		int total = 0;
		for (int num : numbers) {		//enhanced-for문 사용하기		// numbers 배열의 값을 하나씩 순서대로 null에 담기
			total += num;
			//total에 숫자 누적시키기 
			
		}
		System.out.println("총합: " + total);
		
	}	
	
		

}
