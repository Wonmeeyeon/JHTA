package com.sample.bookstore.vo;

import java.util.Date;

public class Question {

	private int no;
	private String title;
	private User user;
	private String content;
	private int viewCount;
	private String status;
	private String type;
	private Date registeredDate;
	private Answer answer;
	
	public Question() {}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public User getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}

	public int getViewCount() {
		return viewCount;
	}

	public String getStatus() {
		return status;
	}

	public String getType() {
		return type;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	};
	
	
}
