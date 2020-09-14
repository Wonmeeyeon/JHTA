package com.sample.bookstore;

import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

import com.sample.bookstore.service.BookstoreService;
import com.sample.bookstore.vo.Book;
import com.sample.bookstore.vo.User;

public class BookstoreApp {

	public static void main(String[] args) {
	
		BookstoreService service = new BookstoreService();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println();
			System.out.println("[도서 대여점 관리 프로그램]");
			System.out.println("================================================");
			System.out.println(" 1.회원관리  2.도서관리  3.대여관리  0.종료");
			System.out.println("================================================");
			
			System.out.print("메뉴를 선택하세요: ");
			int menuNo = scanner.nextInt();
			
			if (menuNo == 1) {
				System.out.println();
				System.out.println("[회원 관리]");
				System.out.println("================================================");
				System.out.println(" 1.등록  2.조회  3.변경  4.탈퇴  5.전체조회 ");
				System.out.println("================================================");
				
				System.out.print("회원관련 메뉴를 선택하세요: ");
				int userMenuNo = scanner.nextInt();
				
				if (userMenuNo == 1) {
					System.out.println("[신규 회원 등록]");
					
					System.out.print("이름을 입력하세요: ");
					String name = scanner.next();
					System.out.print("전화번호를 입력하세요: ");
					String tel = scanner.next();
					
					service.addNewUser(name, tel);
					System.out.println("### 회원등록이 완료되었습니다. ###");
					
				} else if (userMenuNo == 2) {
					System.out.println("[회원 조회 서비스]");
					System.out.print("회원 번호를 입력하세요: ");
					int no = scanner.nextInt();
					
					service.retrieveUserInfo(no);
					
				} else if (userMenuNo == 3) {
					
					System.out.println("[회원 정보 변경 서비스]");
					System.out.println("회원 번호를 입력하세요: ");
					int no = scanner.nextInt();
					
					System.out.println("회원 이름을 입력하세요: ");
					String name = scanner.next();
					
					System.out.println("회원 전화번호를 입력하세요: ");
					String tel = scanner.next();
					
					User user = new User();
					user.no = no;
					user.name = name;
					user.tel =tel;
					
					service.modifyUserInfo(user);
					System.out.println("### 회원정보가 수정되었습니다. ###");
					
				} else if (userMenuNo == 4) {
					System.out.println("[회원 탈퇴 서비스]");
					System.out.println("회원 번호를 입력하세요: ");
					int userNo = scanner.nextInt();
					
					service.disabledUser(userNo);
					
					
					
				} else if (userMenuNo == 5) {
					System.out.println("[전체 조회 서비스]");
					service.retrieveAllUsers();
					
				}
				
			} else if (menuNo == 2) {
				System.out.println();
				System.out.println("[도서 관리]");
				System.out.println("================================================");
				System.out.println(" 1.검색  2.등록  3.수정  4.전체조회");
				System.out.println("================================================");
				
				System.out.println("사용하실 서비스 번호를 선택하세요: ");
				int bookNo =scanner.nextInt();	
				
				if (bookNo== 1) {
					System.out.println("### 도서검색 서비스 ###");
					System.out.println("검색하실 책 제목을 입력하세요: ");
					String book = scanner.next();
					service.searchBooks(book);
					
					
					
				}else if (bookNo ==2 ) {
					System.out.println("### 도서등록 서비스 ###");
					System.out.println("등록하실 책의 제목을 입력하세요: ");
					String title = scanner.next();
					System.out.println("등록하실 책의 저자를 입력하세요: ");
					String writer = scanner.next();
					System.out.println("등록하실 책의 가격을 입력하세요: ");
					int price = scanner.nextInt();
					
					service.insertNewBook(title, writer, price);
					
				}else if (bookNo ==3) {
					System.out.println("### 도서수정 서비스 ###");
					System.out.println("정보 수정할 책 번호를 입력해주세요:");
					int modifyBookNo =scanner.nextInt();
					
					System.out.println("제목을 입력해주세요: ");
					String title = scanner.next();
					System.out.println("작가를 입력해주세요: ");
					String writer = scanner.next();
					System.out.println("가격을 입력해주세요:");
					int price = scanner.nextInt();
					
					Book book = new Book();
					book.no = modifyBookNo;
					book.title = title;
					book.writer = writer;
					book.price = price;
					
					service.modifyBook(book);
					
					System.out.println("수정이 완료되었습니다.");
					
				}else if (bookNo ==4) {
					System.out.println("### 도서 전체조회 서비스 ###");
					service.retrieveAllBooks();
				}
				
				
			} else if (menuNo == 3) {
				System.out.println();
				System.out.println("[대여/반납 관리]");
				System.out.println("================================================");
				System.out.println(" 1.대여  2.반납  3.대여현황조회");
				System.out.println("================================================");
				System.out.println("사용하실 서비스 번호를 선택하세요: ");
				int rentalNum = scanner.nextInt();
				if (rentalNum == 1) {
					System.out.println("사용자 번호를 입력해주세요: ");
					int userNo = scanner.nextInt();
					System.out.println("책번호를 입력해주세요: ");
					int bookNo = scanner.nextInt();
					
					service.rentBook(userNo, bookNo);
				
					
				}else if (rentalNum ==2) {
					System.out.println("반날할 책의 대여번호를 입력하세요");
					int rentalNo = scanner.nextInt();
					service.returnBook(rentalNo);
					
					System.out.println("반납되었습니다.");
					
					
				}else if (rentalNum ==3) {
					System.out.println("### 대여 현황 ###");
					service.retrieveAllRentals();
					
				}
				
				
				
			} else if (menuNo == 0) {
				System.out.println("[프로그램 종료]");
				break;
			}
		}
		
		scanner.close();
	}
}