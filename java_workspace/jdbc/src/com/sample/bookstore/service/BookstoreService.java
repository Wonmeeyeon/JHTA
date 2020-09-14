package com.sample.bookstore.service;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import com.sample.bookstore.dao.BookDAO;
import com.sample.bookstore.dao.OrderDAO;
import com.sample.bookstore.dao.QuestionDao;
import com.sample.bookstore.dao.UserDAO;
import com.sample.bookstore.vo.Book;
import com.sample.bookstore.vo.Order;
import com.sample.bookstore.vo.Question;
import com.sample.bookstore.vo.User;

/**
 * 회원가입, 책검색, 책 상세정보 조회, 
 * 주문하기, 내 주문 조회하기, 주문 상세정보 보기 등 의
 * 기능을 제공하는 객체다. 
 * @author JHTA
 *
 */
public class BookstoreService {
	
	private BookDAO bookDAO = new BookDAO();
	private UserDAO userDAO = new UserDAO();
	private OrderDAO orderDAO = new OrderDAO();
	private QuestionDao questionDAO = new QuestionDao();
	
	/**
	 * 신규 사용자 정보를 등록한다.
	 * @param user 신규 사용자 정보
	 * @return 회원가입이 성공하면 true를 반환한다.
	 * @throws Exception
	 */
	public boolean 회원가입(User user) throws Exception {
		User savedUser = userDAO.getUserById(user.getUserId());
		if (savedUser != null) {
			return false;
		}
		
		// 비밀번호 암호화하기 aparche에서 다운받은 commons_codec.jar 라이브러리 넣기
		String md5Password = DigestUtils.md5Hex(user.getPassword());
		user.setPassword(md5Password);

		userDAO.addUser(user);
		return true;
	}
	
	/**
	 * 지정된 키워드가 제목에 포함된 책정보를 반환한다.
	 * @param title 검색 키워드
	 * @return 검색된 책들
	 * @throws Exception
	 */
	public List<Book> 도서검색(String title) throws Exception {
		
		return bookDAO.getBooksByTitle(title);
	}
	
	/**
	 * 지정된 책번호에 해당하는 책정보를 반환한다.
	 * @param bookNo 조회할 책번호
	 * @return 책정보, 유효한 번호가 아닌 경우 null이 반환된다.
	 * @throws Exception
	 */
	public Book 도서상세정보(int bookNo) throws Exception {
		return bookDAO.getBookByNo(bookNo);
	}
	
	/**
	 * 주문요청을 처리합니다.
	 * @param userId 주문자 아이디
	 * @param bookNo 주문할 책번호
	 * @param amount 주문 수량
	 * @return 주문성공시 true를 반환한다.
	 * @throws Exception 
	 */
	public boolean 주문하기(String userId, int bookNo, int amount) throws Exception {
		User user = userDAO.getUserById(userId);
		if (user == null) {
			return false;
		}
		
		Book book = bookDAO.getBookByNo(bookNo);
		if (book == null) {
			return false;
		}
		if (book.getStock() < amount) {
			return false;
		}
		
		Order order = new Order();
		order.setUser(user);
		order.setBook(book);
		order.setAmount(amount);
		order.setPrice(book.getDiscountPrice());
		
		// 주문정보 저장
		orderDAO.addOrder(order);
		
		// 책 재고 변경
		book.setStock(book.getStock() - amount);
		bookDAO.updateBook(book);
		
		// 사용자 포인트 변경
		int depositPoint = (int) (book.getDiscountPrice()*amount*0.03);
		user.setPoint(user.getPoint() + depositPoint);
		userDAO.updateUser(user);
		
		return true;
	}
	
	/**
	 *  지정된 사용자아이디의 모든 주문내역을 반환한다.
	 * @param userId 주문내역을 조회할 사용자 아이디
	 * @return 주문내역정보, 주문내역이 없는 경우 empty List가 반환된다.
	 * @throws Exception
	 */
	public List<Order> 내주문조회(String userId) throws Exception {
		
		return orderDAO.getOrderByUserId(userId);
	}
	
	/**
	 * 지정된 주문번호에 해당하는 주문정보를 반환한다.
	 * @param orderNo 주문정보를 조회할 주문번호
	 * @return 주문정보 상세내역, 주문번호가 틀린 경우 null 이 반환된다.
	 * @throws Exception
	 */
	public Order 주문상세정보(int orderNo) throws Exception {
		
		return orderDAO.getOrderByNo(orderNo);
	}
	public void 문의등록(Question question) throws Exception{
		// 사용자가 존재하는지 체크
	
		User user = userDAO.getUserById(question.getUser().getUserId());
		if (user == null) {
			System.out.println("회원정보가 존재하지 않습니다.");
			return;
		} 
			
		
		questionDAO.addQuestion(question);	
		
	}
	
	public List<Question> getAllQuestions()  throws Exception {
		List<Question> allQue = questionDAO.getAllQuestions();
		
		return allQue;
	}
	public Question getQuestionByNo(int questionNo) throws Exception{
	
		return questionDAO.getQuestionByNo(questionNo);
 	}
	
	public void 문의글삭제(int questionNo, String userId) throws Exception{
		
		User user = userDAO.getUserById(userId);
		
		if (user == null ) {
			System.out.println("일치하는 회원정보가 없습니다.");
			return;
		}
		
		Question question = questionDAO.getQuestionByNo(questionNo);
		
		if (question == null) {
			System.out.println("해당하는 번호의 글이 없습니다.");
			return;
		}
		questionDAO.removeQuestion(questionNo);	
		System.out.println("!!! 삭제되었습니다.");
	
		
	}
	
}
