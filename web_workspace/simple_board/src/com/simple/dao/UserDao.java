package com.simple.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.simple.util.ConnectionUtil;
import com.simple.util.QueryUtil;
import com.simple.vo.User;


public class UserDao {
	
	public User getUserbyId(String userId) throws Exception {
		User user = null;
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("user.getUserById"));
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			user = new User();
			
			user.setId(rs.getString("user_id"));
			user.setName(rs.getString("user_name"));
			user.setPassword(rs.getString("user_password"));
			user.setEmail(rs.getString("user_email"));
			user.setDisabled(rs.getString("user_disabled"));
			user.setCreateDate(rs.getDate("user_create_date"));
			
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return user;
		
	}
	
	public void insertUser(User user) throws Exception {
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("user.insertUser"));
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getName());
		pstmt.setString(3, user.getPassword());
		pstmt.setString(4, user.getEmail());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
		
	}
	
	public void updateUser(User user) throws SQLException {
		Connection connection =ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("user.updateUser"));
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getEmail());
		pstmt.setString(3, user.getDisabled());
		pstmt.setString(4, user.getId());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	

}
