package jeongseok_examples.Chapter03;

public class Ex3_2 {

	public static void main(String[] args) {
	
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		i=5; j=0;   // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경함
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
	}
}
