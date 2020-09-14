package oop1;

public class AcountDemo {

	public static void main(String[] args) {
		// 클래스변수 사용하기
		// 클래스변수를 "클래스명.변수명"의 형태로 객체 생성과 상관없이 사용가능하다.
		System.out.println("금리: " + Acount.RATE_OF_INTEREST);
		
		Acount acc1 = new Acount();
		acc1.owner ="홍길동";
		acc1.no = "110-1234-12";
		acc1.password = "1234";
		acc1.balance =  20000000;
		acc1.period = 24;
		
		
		Acount acc2 = new Acount();
		acc2.owner ="김유신";
		acc2.no = "110-4564-13";
		acc2.password = "5678";
		acc2.balance =  65000000;
		acc2.period = 27;
		
		// 해지 환급금 계산하기
		// 해지 환급금 = 잔액 잔액*금리*(개월수/12)
		long money1 = acc1.balance + (long) (acc1.balance*Acount.RATE_OF_INTEREST*acc1.period/12);
		long money2 = acc2.balance + (long) (acc2.balance*Acount.RATE_OF_INTEREST*acc2.period/12);
		
		System.out.println("첫번째 계좌의 해지환급금: " + money1);
		System.out.println("두번째 계좌의 해지환급금: " + money2);
	}
}
