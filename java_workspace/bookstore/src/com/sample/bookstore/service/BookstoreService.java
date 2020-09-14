package com.sample.bookstore.service;



import javax.swing.text.Position;

import com.sample.bookstore.vo.Book;
import com.sample.bookstore.vo.Rental;
import com.sample.bookstore.vo.User;

public class BookstoreService {

	BookService bookService = new BookService();
	UserService userService = new UserService();
	RentalService rentalService = new RentalService();
	
	// 회원등록 서비스
	// 이름, 전화번호를 전달받아서 회원등록 서비스를 제공한다.
	// 		- User객체를 생성해서 이름과 전화번호를 저장한다.
	//		- 회원등록시 100포인트를 지급한다.
	//		- UserService의 회원등록 기능을 실행한다.
	public void addNewUser(String name, String tel) {
		User user = new User();
		user.name = name;
		user.tel = tel;
		user.point = 100;
		user.isDisabled = false;
		
		userService.insertUser(user);
	}
	
	// 회원조회 서비스
	// 회원번호를 전달받아서 회원번호에 대한 회원정보를 화면에 출력한다.
	//		- UserService의 회원조회기능을 실행해서 회원정보를 제공받는다.
	//		- 조회된 회원정보를 화면에 출력한다.
	public void retrieveUserInfo(int userNo) {
		
		User user = userService.findUserByNo(userNo);
		if (user != null) {
			System.out.println("### 사용자 정보 ###");
			System.out.println("회원번호: " + user.no);
			System.out.println("이름: " + user.name);
			System.out.println("전화번호: " + user.tel);
			System.out.println("포인트: " + user.point);
			System.out.println("탈퇴여부: " + user.isDisabled);
		} else  {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}
	
	// 회원수정 서비스
	// 수정할 회원정보를 전달받아서 해당 회원의 정보를 수정한다.
	//		- UserService의 회원정보 변경기능을 실행해서 회원정보를 수정한다.
	public void modifyUserInfo(User user) {
		System.out.println("### 변경된 사용자 정보 ###");
		userService.updateUser(user);
		
		
	}
	
	// 회원탈퇴 서비스
	// 탈퇴처리할 회원번호를 전달받아서 해당 회원을 탈퇴처리한다.
	//		- UserService의 회원조회기능을 실행해서 회원정보를 제공받는다.
	//		- 조회된 회원의 탈퇴여부를 탈퇴처리로 변경한다.
	//		- RentalService의 반납기능을 실행해서 해당 회원이 대여중인 모든 책을 반납처리한다.
	public void disabledUser(int userNo) {
		retrieveUserInfo(userNo);
		User user = userService.findUserByNo(userNo);
		if (user == null) {
			
			return; 
			
		}
		user.isDisabled = true;
		System.out.println("### 탈퇴가 완료되었습니다. ###");
		
		
		
	}
	
	// 전체 회원조회 서비스
	// 등록된 모든 회원정보 조회를 처리한다.
	// 		- UserService의 모든 회원정보 조회기능을 실행해서 모든 회원정보를 제공받는다.
	//		- 조회된 회원정보를 화면에 출력한다.(null체크)
	public void retrieveAllUsers() {
		User[] user = userService.getAllUsers();
		System.out.println("번호              이름                  전화번호              포인트           탈퇴여부");
		for ( int i=0; i<user.length; i++) {
			if (user[i] == null) {
				break;
			}
			
			System.out.print(user[i].no + "\t");
			System.out.print(user[i].name + "\t");
			System.out.print(user[i].tel + "\t");
			System.out.print(user[i].point + "\t");
			System.out.println(user[i].isDisabled);
			
		}
		
	}
	
	// 도서등록 서비스
	// 제목, 저자, 가격을 전달받아서 도서 등록 서비스를 처리한다.
	//		- Book객체를 생성해서 제목, 저자, 가격 정보를 저장한다.
	//		- 재고는 10000권으로 한다.
	// 		- BookService의 도서등록기능을 실행한다.
	public void insertNewBook(String title, String writer, int price) {
		Book book = new Book();
		book.title = title;
		book.writer = writer;
		book.price = price;
		book.stock =10000;
		bookService.insertBook(book);
	}
	
	// 도서 검색 서비스
	// 제목를 전달받아서 도서 검색서비스를 처리한다.
	//		- BookService의 도서 검색기능을 실행해서 책정보를 제공받는다.
	//		- 조회된 책정보를 화면에 출력한다.
	public void searchBooks(String title) {
		Book[] book = bookService.findBookByTitle(title);
		if (book.length == 0) {
			System.out.println("해당 책이 없습니다.");
		}
			for(int i=0; i<book.length; i++) {
				 System.out.println(book[i].no);
				 System.out.println(book[i].title);
				 System.out.println(book[i].writer);
				 System.out.println(book[i].price);
				 System.out.println(book[i].stock);
				 
			}
		
		
	}
	
	// 도서 정보 수정 서비스
	// 책정보를 전달받아서 책정보 수정서비스를 처리한다.
	//		- BookService의 책정보 수정기능을 실행한다.
	public void modifyBook(Book book) {
		bookService.updateBook(book);
		
	}
	// 도서 정보 전체 조회 서비스 /없어서 내가 만듦
	public void retrieveAllBooks() {
		Book[] book = bookService.getAllBooks();
		System.out.println("책번호     	    제목                           저자             가격           재고");
		for ( int i=0; i<book.length; i++) {
			if (book[i] == null) {
				break;
			}
			
			System.out.print(book[i].no + "\t");
			System.out.print(book[i].title + "\t");
			System.out.print(book[i].writer + "\t");
			System.out.print(book[i].price + "\t");
			System.out.println(book[i].stock);
			
		}
		
	}
	
	// 대여 서비스
	// 사용자번호와 책번호를 전달받아서 대여 서비스를 처리한다.
	//		- Rental객체를 생성해서 사용자번호, 책번호를 저장한다.
	//		- 대여여부는 대여중으로 설정한다.
	//		- 책재고 변경하기
	//			- BookService에서 책번호에 해당하는 책정보 조회기능 실행
	//			- 조회된 책의 재고를 1감소시킨다.
	public void rentBook(int userNo, int bookNo) {
		
		Rental rental = new Rental();
		rental.userNo = userNo;
		rental.bookNo = bookNo;
		rental.isRent =true;
		rentalService.insertRental(rental);
		
		Book book = bookService.findBookByNo(bookNo);
		book.stock--;
		System.out.println(book.stock);
		
		
		
		
		
	}
	
	// 반납 서비스
	// 대여번호를 전달받아서 반납 서비스를 처리한다.
	//		- RentalService에서 대여번호에 해당하는 대여정보 조회 기능을 실행
	//		- 조회된 대여정보의 반납여부를 false로 설정한다.
	//		- 사용자포인트 증가, 책재고 변경하기
	//			- UserService에서 사용자번호로 사용자정보 조회하기 실행
	//			- BookService에서 책번호로 책정보 조회하기 실행
	//			- 조회된 사용자의 포인트를 책가격의 1%만큼 증가시키기
	//			- 조회된 책정보의 재고를 1증가시키기
	public void returnBook(int rentalNo) {
		Rental rental = rentalService.findRentalByNo(rentalNo);
		Book book = bookService.findBookByNo(rental.bookNo);
		User user = userService.findUserByNo(rental.userNo);
		user.point +=book.price*0.01;
		book.stock++;
		System.out.println(book.stock);
		
	}
	
	// 대여현황 조회 서비스
	// 모든 대여정보를 조회하는 서비스를 처리한다.
	//		- RentalService의 전체 대여정보조회 기능을 실행한다.
	//		- 조회된 대여정보를 화면에 출력한다. (null체크)
	public void retrieveAllRentals() {
		Rental[] rental = rentalService.getAllRentals();
		System.out.println("대여번호	도서번호	책제목	고객번호	고객명	대여여부");
		for (int i=0; i<rental.length; i++) {
			if (rental[i] == null) {
				break;	
			}
			Book book = bookService.findBookByNo(rental[i].bookNo);
			User user = userService.findUserByNo(rental[i].userNo);
			System.out.print(rental[i].no + "\t");
			System.out.print(rental[i].bookNo + "\t");
			System.out.print(book.title+ "\t");
			System.out.print(rental[i].userNo + "\t");
			System.out.print(user.name+ "\t");
			System.out.println(rental[i].isRent + "\t");
		}
	}
	
	
}
