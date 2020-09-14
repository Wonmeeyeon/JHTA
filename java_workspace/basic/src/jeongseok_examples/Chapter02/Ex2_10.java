package jeongseok_examples.Chapter02;

import java.util.Scanner; 			// Scanner 사용을 위해 추가

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 자리 정수를 하나 입력해주세요: ");
		String input = scanner.nextLine();		// 입력받은 문자열을 input에 저장
		int num = Integer.parseInt(input);		// input에 입력받은 문자열을 다시 숫자(int)로 변환
		
		System.out.println("입력내용: " + input);	// 입력내용 : (입력받은 문자열)input
		System.out.printf("num=%d%n", num);		// num=(10진법 정수 형태로 표현된 숫자)num
	}
	
}

//예제 2-10. 교재 61p