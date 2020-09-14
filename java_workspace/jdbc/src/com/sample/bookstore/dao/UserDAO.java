package com.sample.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sample.bookstore.util.ConnectionUtil;
import com.sample.bookstore.util.QueryUtil;
import com.sample.bookstore.vo.User;

public class UserDAO {

	public void addUser(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("user.addUser"));
		pstmt.setString(1, user.getUserId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getEmail());
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	/**
	 * 유저아이디에 해당하는 사용자 정보를 반환한다.
	 * @param userId 사용자 아이디
	 * @return 사용자정보가 포함된 User 객체, userId가 틀리면 null이 반환된다.
	 * @throws Exception
	 */
	public User getUserById(String userId) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("user.getUserById"));
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		User user = null;
		
		if (rs.next()) {
			user = new User();
			user.setUserId(rs.getString("user_id"));
			user.setPassword(rs.getString("user_password"));
			user.setName(rs.getString("user_name"));
			user.setEmail(rs.getString("user_email"));
			user.setPoint(rs.getInt("user_point"));
			user.setRegisteredDate(rs.getDate("user_registered_date"));
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return user;
	}
	
	public void updateUser(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("user.updateUser"));
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getEmail());
		pstmt.setInt(3, user.getPoint());
		pstmt.setString(4, user.getUserId());
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
}





