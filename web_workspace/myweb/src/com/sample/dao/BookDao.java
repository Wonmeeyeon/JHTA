package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sample.util.ConnectionUtil;
import com.sample.vo.Book;

public class BookDao {
	
	public void insertBook(Book book) throws SQLException {
		String sql = "insert into sample_books "
					+ "(book_no, book_title, book_writer, book_genre, "
					+ " book_publisher, book_price, book_discount_price, book_stock) "
					+ "values "
					+ " (sample_book_seq.nextval, ?,?,?,?,?,?,?)";
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement psmt =connection.prepareStatement(sql);
		psmt.setString(1, book.getTitle());
		psmt.setString(2, book.getWriter());
		psmt.setString(3, book.getGenre());
		psmt.setString(4, book.getPublisher());
		psmt.setInt(5, book.getPrice());
		psmt.setInt(6, book.getDiscountPrice());
		psmt.setInt(7, book.getStock());
		
		psmt.executeUpdate();
		
		psmt.close();
		connection.close();
		
		
		
		
	} 

}
