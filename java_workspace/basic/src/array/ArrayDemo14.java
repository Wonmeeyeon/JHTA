package array;

import java.util.Scanner;
import java.util.function.IntPredicate;

import javax.print.DocFlavor.INPUT_STREAM;

public class ArrayDemo14 {
	
	public static void main(String[] args) {
		/*
		 * 이중 포문 사용
		 * 10번 안에 못맞추면 못맞춘걸로
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] srcnum = new int[3];
		srcnum[0] = (int)(Math.random()*9+1);
		srcnum[1] = (int)(Math.random()*9+1);
		srcnum[2] = (int)(Math.random()*9+1);
		System.out.println(srcnum[0]+""+srcnum[1]+""+srcnum[2]);
		
		while(true) { 
			int[] inputnum = new int[3];
			System.out.print("숫자를 입력하세요");
			inputnum[0] = sc.nextInt();
			inputnum[1] = sc.nextInt();
			inputnum[2] = sc.nextInt();
			for (int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(inputnum[i]==srcnum[j] && i==j) {
						System.out.println("스트라이크");
					
					} else if (inputnum[i]==srcnum[j] && i!=j) {
						System.out.println("볼");
					}
				
				}
			}
			int strike = 0;
			int ball = 0;
			
		}
		
	}

}
