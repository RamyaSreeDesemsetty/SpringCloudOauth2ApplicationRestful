package com.ex.SpringCloudOauth2ApplicationRestful.controller;

import java.util.List;

//BookController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.SpringCloudOauth2ApplicationRestful.entity.Book;
import com.ex.SpringCloudOauth2ApplicationRestful.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	@Autowired
	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/")
	public Book getBookById(@PathVariable Long id) {
		return bookService.getBookById(id);
	}

	@PostMapping("/")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@DeleteMapping("/")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
	}
}

