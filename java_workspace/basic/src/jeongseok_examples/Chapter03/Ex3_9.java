package jeongseok_examples.Chapter03;

public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000; // 100만
		int b = 2_000_000; // 200만
		
		long c = a * b; // 2_000_000_000_000 2조?
		
		System.out.println(c); // int값끼리의 계산이므로. 다음 예제를 보자. 
	}
}
