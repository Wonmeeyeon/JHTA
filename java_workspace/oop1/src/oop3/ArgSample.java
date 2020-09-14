package oop3;

public class ArgSample {
	
	//기본자료형 타입의 값을 매개변수로 전달받는 겨우		// call by Value 
											// 메소드의 매개변수에 기본자료형 값을 전달해서 메소드를 실행하는 것
											// 호출된 메소드에서 전달받은 값을 변경해도 원래 값은 변경되지 않는다.
	void changeValue(int num) {
		
		System.out.println("changeValue()에서의 before num ---> " + num);
		num =150;
		System.out.println("changeValue()에서의 after num ---->" + num);
	}
	
	//참조형 타입의 값을 매개변수로 전달받는 경우			// call by Reference 
											// 메소드의 매개변수에 객체의 참조값(주소값)을 전달해서 메소드를 실행하는것
											// 호출된 메소드에서도 원본 객체를 같이 참조하게 된다.
											// 호출된 메소드에서 전달받은 주소값으로 참조되는 객체의 속성을 변경하는 것은
											// 	원본 객체의 속성을 변경하는 것이 된다.
	
	void changevalue(Data data) {
		System.out.println("changeValue()에서의 before data.num ---> " + data.num);
		data.num =300;
		System.out.println("changeValue()에서의 after data.num ---->" + data.num);	
	}
}
