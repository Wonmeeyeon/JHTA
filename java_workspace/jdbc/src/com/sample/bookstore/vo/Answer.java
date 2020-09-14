package com.sample.bookstore.vo;

import java.util.Date;

public class Answer {

	private int answerNo;
	private String content;
	private int questionNo;
	private Date registeredDate;
	
	public Answer() {}

	public int getAnswerNo() {
		return answerNo;
	}

	public String getContent() {
		return content;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	
}
