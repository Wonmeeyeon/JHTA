package jeongseok_examples.Chapter03;

public class Ex3_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;  // Math.round는 소숫점 첫 자리에서 반올림, 소수점 n번째 자리에서 반올림을 하고 싶다면
														// 10의 (n-1)제곱을 곱해서 계산하고 다시 10의 (n-1)제곱으로 나누기
		System.out.println(shortPi);
	}
	
}
