package com.hcl.library;

public class Books {
	private int Id;
	private String Name;
	private String Author;
	private String Edition;
	private String dept;
	private int TotalBooks;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getEdition() {
		return Edition;
	}
	public void setEdition(String edition) {
		Edition = edition;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getTotalBooks() {
		return TotalBooks;
	}
	public void setTotalBooks(int totalBooks) {
		TotalBooks = totalBooks;
	}
	
}