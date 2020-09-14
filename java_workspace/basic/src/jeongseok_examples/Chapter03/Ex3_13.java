package jeongseok_examples.Chapter03;

public class Ex3_13 {

	public static void main(String[] args) {
		
		// %연산자는 음수에도 문제 없이 적용되지만, 부호가 무시되고 절대값으로 계산한 나머지가 나온다.
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
	}
}
