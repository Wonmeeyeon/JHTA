package meeyeon;

public class Book {
	
	// 멤버변수 = 인스턴스 변수
	String title;
	String writer;
	String publisher;
	int price;
	String genre;
	
	Book() {
		publisher = "한빛미디어";
	}
	
	Book(String inputTitle, String inputwriter, String inputpublisher, int inputprice, String inputgenre) {
		title = inputTitle;
		writer = inputwriter;
		publisher = inputpublisher;
		price = inputprice;
		genre = inputgenre;
	}
	
	Book(String inputTitle, String inputwriter, int inputprice, String inputgenre) {
		title = inputTitle;
		writer = inputwriter;
		publisher = "한빛미디어";
		price = inputprice;
		genre = inputgenre;
	}
	
	void printBookInfo() {
		System.out.println("=========도서정보==========");
		System.out.println("제목: " + title );
		System.out.println("저자: " + writer );
		System.out.println("출판사: " + publisher);
		System.out.println("가격: " + price);
		System.out.println("장르: " + genre);
		System.out.println("========================");
		
	}

}
