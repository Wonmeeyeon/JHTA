package jeongseok_examples.Chapter03;

public class Ex3_4 {

	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i); // 부호 연산자 +는 하는 일이 없다.
		
		i = -10;
		i = -i;
		System.out.println(i); // 부호 연산자 -는 피연산자의 부호를 반대로 변경한 결과를 갖는다.
		
	}
}
