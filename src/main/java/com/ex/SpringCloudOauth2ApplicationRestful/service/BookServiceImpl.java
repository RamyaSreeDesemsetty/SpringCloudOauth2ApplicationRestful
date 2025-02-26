package com.ex.SpringCloudOauth2ApplicationRestful.service;

import java.util.List;
import java.util.Optional;

//BookServiceImpl.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.SpringCloudOauth2ApplicationRestful.entity.Book;
import com.ex.SpringCloudOauth2ApplicationRestful.repository.BookRepository;




@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private final BookRepository bookRepository;

	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		return optionalBook.orElse(null);
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}

}

