package jeongseok_examples.Chapter02;

public class Ex2_12 {

	public static void main(String[] args) {
		
		String str = "3";
		
		// str.charAt(0) : String을 char로 변환
		// char - '0' : 문자를 숫자로 변환
		// Integer.parseInt("") : 문자열을 숫자로 변환 (Double.parseDouble()을 사용해도 됨)
		// 숫자를 문자로 변환 : 숫자 + '0'
		
		System.out.println(str.charAt(0)-'0');  
		System.out.println('3'-'0'+1);
		System.out.println(Integer.parseInt("3")+1);
		System.out.println("3"+1);
		System.out.println((char)(3+'0'));
	}
}

//예제 2-12. 교재 66p
// 예제 2-11, 2-12는 따라 써보기만 하고 꼼꼼하게 못 봄 다시 볼 것