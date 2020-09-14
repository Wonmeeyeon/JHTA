package jeongseok_examples.Chapter03;

public class Ex3_10 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b); // long으로 하나의 값을 변환해줘야 계산이 제대로 됨
		
	}
	
}
