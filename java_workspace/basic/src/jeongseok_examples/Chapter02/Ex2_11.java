package jeongseok_examples.Chapter02;

public class Ex2_11 {
	public static void main(String[] args) {
		
		// short 타입 최소값 sMin 최대값 sMax
		// char 타입 최소값 cMin 최대값 cMax
		// short 타입은 부호가 있는 숫자로, 범위가 -32768부터 +32767까지임
		// char 타입은 숫자로 변환했을 때 부호가 없고, 범위가 0부터 65535까지임
		// sMin-1, cMin-1은 각자 최대값으로 overflow, sMax+1, cMax+1은 최소값으로 overflow
		// 
		
		short sMin = -32768, sMax = 32767;
		char cMin = 0, cMax = 65535;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int) cMax);
		System.out.println("cMax+1 = " + (int)++cMax);
		
	}

}

//예제 2-11. 교재 65p