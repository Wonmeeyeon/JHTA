package com.simple.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simple.dto.BoardDto;
import com.simple.util.ConnectionUtil;
import com.simple.util.QueryUtil;
import com.simple.vo.Board;

public class BoardDao {
	
	public void insertBoard(Board board) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("board.insertBoard"));
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getWriter());
		pstmt.setString(3, board.getContent());
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	public int getTotalRows() throws SQLException {
		int totalRows =0;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("board.getTotal"));
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		totalRows = rs.getInt("cnt");
		rs.close();
		pstmt.close();
		connection.close();
		return totalRows;
	}
	
	public List<Board> getAllBoards() throws Exception {
		List<Board> boards = new ArrayList<Board>();
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("board.getAllBoard"));
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Board board = new Board();
			
			board.setNo(rs.getInt("board_no"));
			board.setTitle(rs.getString("board_title"));
			board.setWriter(rs.getString("board_writer"));
			board.setContent(rs.getString("board_content"));
			board.setHit(rs.getInt("board_hit"));
			board.setReplyCnt(rs.getInt("board_reply_cnt"));
			board.setDelYn(rs.getString("board_del_yn"));
			board.setCreateDate(rs.getDate("board_create_date"));
			
			boards.add(board);
			
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return boards;
		
	}
	
	public void updateBoard(Board board) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQl("board.updateBoard"));
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setInt(3, board.getHit());
		pstmt.setInt(4, board.getReplyCnt());
		pstmt.setString(5, board.getDelYn());
		pstmt.setInt(6, board.getNo());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	public BoardDao getBoard(int boardNo) throws SQLException {
		BoardDao dto = null;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt= connection.prepareStatement(QueryUtil.getSQl("boarf.getboard"));
		pstmt.setInt(1, boardNo);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			dto = new BoardDto();
		
			
		}
		
		return dto;
	}

}
