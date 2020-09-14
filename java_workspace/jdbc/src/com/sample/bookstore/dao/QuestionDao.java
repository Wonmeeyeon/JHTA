package com.sample.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sample.bookstore.util.ConnectionUtil;
import com.sample.bookstore.util.QueryUtil;
import com.sample.bookstore.vo.Question;
import com.sample.bookstore.vo.User;

public class QuestionDao {

	public void addQuestion(Question question) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("question.addQuestion"));
		pstmt.setString(1, question.getTitle());
		pstmt.setString(2, question.getUser().getUserId());
		pstmt.setString(3, question.getContent());
		pstmt.setString(4, question.getType());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	public List<Question> getAllQuestions() throws Exception {
		List<Question> questions = new ArrayList<Question>();
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection. prepareStatement(QueryUtil.getSQl("question.getAllQuestions"));
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int no = rs.getInt("question_no");
			String title = rs.getString("question_title");
			String userId = rs.getString("user_id");
			String content = rs.getString("question_content");
			int viewCount = rs.getInt("question_view_count");
			Date registeredDate = rs.getDate("question_registered_date");
			String status = rs.getString("question_status");
			String type = rs.getString("question_type");
			
			Question question = new Question();
			question.setNo(no);
			question.setTitle(title);
			question.setContent(content);
			question.setViewCount(viewCount);
			question.setRegisteredDate(registeredDate);
			question.setStatus(status);
			question.setType(type);
			
			User user = new User();
			user.setUserId(userId);
			question.setUser(user);
			
			
			questions.add(question);			
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return questions;
	}
	public Question getQuestionByNo(int questionNo) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection. prepareStatement(QueryUtil.getSQl("question.getQuestionByNo"));
		pstmt.setInt(1, questionNo);
		ResultSet rs = pstmt.executeQuery();
		
		Question question = null;
		
		if (rs.next()) {
			int no = rs.getInt("question_no");
			String title = rs.getString("question_title");
			String userId = rs.getString("user_id");
			String content = rs.getString("question_content");
			int viewCount = rs.getInt("question_view_count");
			Date registeredDate = rs.getDate("question_registered_date");
			String status = rs.getString("question_status");
			String type = rs.getString("question_type");
			
			question = new Question();
			question.setNo(no);
			question.setTitle(title);
			question.setContent(content);
			question.setViewCount(viewCount);
			question.setRegisteredDate(registeredDate);
			question.setStatus(status);
			question.setType(type);
			
			User user = new User();
			user.setUserId(userId);
			question.setUser(user);
			
			
					
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return question;
		
	}
	public void removeQuestion(int questionNo) throws Exception {
		Connection connection = ConnectionUtil. getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("question.removeQuestion"));
		pstmt.setInt(1, questionNo);
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	
}
