package com.sample.bookstore.vo;

import java.util.Date;

public class Order {

	private int orderNo;
	private User user;
	private Book book;
	private int price;
	private int amount;
	private Date registeredDate;
	
	public Order() {}

	public int getOrderNo() {
		return orderNo;
	}

	public User getUser() {
		return user;
	}

	public Book getBook() {
		return book;
	}

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	
}
