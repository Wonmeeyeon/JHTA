package oop1;

public class PersonDemo1 {
	
	public static void main(String[] args) {
		
		// Person객체 만들기
		// Person p1: Person 설계도로 생성된 객체의 주소값을 담는 p1변수를 생성함
		// new Person()
		//       Person설계도로 메모리에 객체를 생성하고, 생성된 객체의 주소값을반환함
		// Person p1 = new Person();
		// 		 Person설계도로 메모리에 객체를 생성하고, 생성된 객체의 주소값을
		//		 Person타입의 변수 p1에 대입한다.
		
		Person p1 = new Person();   //동일한 설계도를 이용해서 객체를 3개 만든 것 
		Person p2 = new Person();
		Person p3 = new Person();
		
		// p1이 참조하는 객체의 속성을 변경하기
		p1.name = "김유신";
		p1.tel = "010-1234-5678";
		p1.email = "kimys@naver.com";
		p1.gender ="남자";
		p1.age = 50;
		
		p2.name = "이순신";
		p2.tel = "010-1234-5678";
		p2.email = "leesh@naver.com";
		p2.gender = "남자";
		p2.age = 48;
		
		p3.name = "유관순";
		p3.tel = "010-1234-5678";
		p2.gender = "여자";
		p2.age = 17;
	}

}
