package array;

import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		/*
		 *  5개의 정수를 입력받아서 그 중에서 가장 큰 값을 출력하시오
		 *  
		 */
		Scanner sc=new Scanner(System.in);
		
		//배열생성
		int[] inputnumber = new int[5];

		//5번 반복해서 숫자를 입력받고 배열에 담기
		for(int i=0; i<5; i++) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			inputnumber[i] = num;
		}
		// 최대값 구하기
		int max = 0;
		// 배열에서 가장 큰 값을 찾아서 max에 담기
		for(int num : inputnumber) {
			if(num>max) {
				max = num;
			}
			
		}
		
		System.out.println("최대값: " + max);
	}

}
