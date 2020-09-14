package jeongseok_examples.Chapter02;

public class Ex2_9 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f;	// 0.10, 1.0e-1 (1.0 * e-1(10의 -1승=0.1)
		float f2 = 1e1f;	// 10.0, 1.0e1, 1.0e+1 (1.0 * e+1(10의 1승=10))
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		// printf() : 같은 값을 다른 형식으로 출력하고자 할 때 사용
		//			지시자(specifier)를 통해 변수의 값을 여러 가지 형식으로 변환
		// 		지시자 : 값을 어떻게 출력할 것인지를 지시해주는 역할 
		
		// %f : The result is formatted as a decimal number.
		// 		결과값이 10진수(부동 소수점 형식)로 변환됨
		//		실수형 값을 출력할 때 주로 사용
		// %e : The result is formatted as a decimal number 
		// 	in computerized scientific notation.
		// 		결과값이 10진수의 과학적 표기법(원래 m*10^n / 여기서는 m*e+n 형식인 것 같음)으로 변환됨
		//		지수 형태로 출력할 때 사용
		// %g : The result is formatted using computerized scientific notation 
		//	or decimal format, depending on the precision and value after rounding.
		//		결과값이 반올림 이후의 값과 정확성에 따라 과학적 표기법이나 10진수로 표기됨.
		// 		값을 간략하게 표기할 때 사용
		// %n : \n이랑 같은 것. 줄바꿈 문자
		// %s : 문자열(string)로 출력
		// [%s] : 문자열의 길이만큼 출력공간을 확보
		// [%20s] : 최소 20글자 출력공간 확보(우측정렬)
		// [%-20s] : 최소 20글자 출력공간 확보(좌측정렬)
		// [%.8s] : 왼쪽에서 8글자만 출력
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);  
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);			// 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
	}
}

//예제 2-9. 교재 59p