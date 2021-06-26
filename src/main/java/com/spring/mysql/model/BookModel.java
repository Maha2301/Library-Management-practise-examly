package com.spring.mysql.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookModel {
	@Id
	private int bookId;
	private String quantity;
	private String bookName;
	private String genre;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "BookModel [bookId=" + bookId + ", quantity=" + quantity + ", bookName=" + bookName + ", genre=" + genre
				+ "]";
	}
	public BookModel(int bookId, String quantity, String bookName, String genre) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}
	public BookModel(String quantity, String bookName, String genre) {
		super();
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}
	public BookModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
