package com.ex.SpringCloudOauth2ApplicationRestful.service;

//BookService.java


import java.util.List;

import com.ex.SpringCloudOauth2ApplicationRestful.entity.Book;

public interface BookService {
	List<Book> getAllBooks();

	Book getBookById(Long id);

	Book saveBook(Book book);

	void deleteBook(Long id);
}
