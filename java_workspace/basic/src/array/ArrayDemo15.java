package array;

import java.util.Scanner;

public class ArrayDemo15 {
	public static void main(String[] args) {
		
		/*
		 * 야구게임
		 * 1~9까지의 임의의 수 3개를 가진 배열이 있다.
		 * 사용자로부터 숫자 3개를 입력받아서 순서배로 배열에 저장한다.
		 * 사용자가 입력한 숫자와 임의의 숫자들을 비교해서
		 * 숫자가 동일하고 인덱스도 동일하면 strike
		 * 숫자는 동일하지만 인덱스는 일치하지않으면 ball로 판정한다.
		 * 		최대10회 까지 시도할 수 있다.
		 * 		출력값이 "3S0B"인 경우 사용자가 숫자를 모두 맞힌 경우이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 임의의 숫자를 3개 저장하는 배열
		int[] scrNums = new int[3];
		// 사용자가 입력한 숫자 3개를 저장하는 배열
		int[] inputNums = new int[3];
		
		// 1~9 임의의 숫자를 scrNums에 순서대로 저장하기
		for(int i=0; i<scrNums.length; i++) {
			int ranNum = (int)(Math.random()*9 + 1);
			
			// scrNums에 중복된 숫자가 저장되지 않게 하기 
			boolean isExist = false;
			for (int j=0; j<scrNums.length; j++) {
				// 새로 발생한 난수와 scrNum의 배열의 값을 순서대로 비교한다.
				if (scrNums[j] == ranNum) {
					// 동일한 숫자가 발견되면 isExist를 true로 설정하고,
					// 숫자를 비교하는 for문을 탈출한다.
					isExist = true;
					break;
				}
			}
			// isExist가 false면 중복없음, isExist가 true면 중복이 발생함.
			if (!isExist) {
				// 중복이 없었으므로 난수를 배열에 저장
				scrNums[i] = ranNum;
			}else {
				// 이번에 뽑은 난수가 중복이 발생했으므로 다시 이번 회차를 뽑기 위해서
				// i를 1감소시킴
				i--;
			}
		}
		//사용자가 숫자 맞추기 
		int tryCount =1 ;
		while (true) {
			if (tryCount>10) {
				System.out.println("실패 - 시도 횟수가 10회를 넘었습니다!");
				break;
			}
			
			System.out.print("첫번째 숫자를 입력하세요: ");
			inputNums[0] = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요: ");
			inputNums[1] = sc.nextInt();
			System.out.print("세번째 숫자를 입력하세요: ");
			inputNums[2] = sc.nextInt();
			
			int strikeCount=0;
			int ballCount =0;
			for (int i=0; i<inputNums.length; i++) {
				for(int j=0; j<scrNums.length; j++) {
					if (inputNums[i] == scrNums[j]) {
						if (i == j) {
							strikeCount++;
						}else {
							ballCount++;
						}
					}
				}
			}
			System.out.println("출력값: " + strikeCount + "S" + ballCount + "B" );
			if (strikeCount ==3 ) {
				System.out.println("정답입니다. 시도 횟수는 총 " + tryCount + "회 입니다.");
				break;
			} 
			
			tryCount++;
			
			}
		}
		

	}


