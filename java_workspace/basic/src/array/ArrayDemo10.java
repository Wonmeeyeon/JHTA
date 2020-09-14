package array;

import java.util.Scanner;

public class ArrayDemo10 {
	public static void main(String[] args) {
		//숫자 10개 입력받아서 배열에 담기
		//출력할 값을 담는 변수 만들기
		
		Scanner sc = new Scanner(System.in);
		int[]numbers = new int[10];
		
		for ( int i=0; i<numbers.length; i++) {
			System.out.print("숫자를 입력하세요");
			numbers[i] =sc.nextInt();	
		}
		
		int prev = 0;
		int next = 0;
		int gap = 0;
		
		//인접한 숫자들간의 차이를 계산해서 가장 차이가 큰 숫자와 그 차이를 구하기
		for (int i=0; i<numbers.length -1; i++) {
		 int currentPrev = numbers[i];
		 int currentNext = numbers[i+1];
		 int currentGap = Math.abs(currentPrev - currentNext);
		 
		 if (currentGap > gap) {
			 prev =currentPrev;
			 next =currentNext;
			 gap = currentGap;
		 }

		}
		
		//결과출력하기
		System.out.println("숫자1: " + prev + "숫자2: " + next + "갭: " + gap);
	}

}
