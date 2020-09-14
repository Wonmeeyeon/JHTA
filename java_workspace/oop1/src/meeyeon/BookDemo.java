package meeyeon;

public class BookDemo {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title ="자바는 개어렵다";
		book1.writer ="원미연";
		book1.price =50000;
		book1.genre = "공포/스릴러";
		book1.printBookInfo();
		
		Book book2 = new Book("자바는 쌉어렵다", "원미연", "금빛미디어",60000,"공포");
		book2.printBookInfo();
		
		Book book3 = new Book("자바는 정말이지 어렵다", "원미연", 56000, "추리소설");
		book3.printBookInfo();
		
		
	}
	

		
	
	
	

}
