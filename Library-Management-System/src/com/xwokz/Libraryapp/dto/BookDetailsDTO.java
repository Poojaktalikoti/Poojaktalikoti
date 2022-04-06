package com.xwokz.Libraryapp.dto;

public class BookDetailsDTO {
	private String BookName;
	private String BookaAuthor;
	private int BookPrice;
	private int NoofPages;
	
	public BookDetailsDTO() {
		System.out.println("invoking BookDetailsDTO");
	}
	
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookaAuthor() {
		return BookaAuthor;
	}
	public void setBookaAuthor(String bookaAuthor) {
		BookaAuthor = bookaAuthor;
	}
	public int getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	public int getNoofPages() {
		return NoofPages;
	}
	public void setNoofPages(int noofPages) {
		NoofPages = noofPages;
	}

	
}
