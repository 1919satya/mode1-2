package com.hcl.library;

import com.hcl.library.BooksDao;

import java.util.List;

import com.hcl.library.Books;

public class BooksBal {
	 public static List<Books> searchBooksBal(String critera,String value) {
		    return new BooksDao().searchBooksDao(critera,value);
		  }
}
