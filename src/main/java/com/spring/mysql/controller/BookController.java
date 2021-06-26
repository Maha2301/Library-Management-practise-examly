package com.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mysql.dao.BookRepo;
import com.spring.mysql.model.BookModel;

@RestController
public class BookController {
	@Autowired
	BookRepo repo;
	
	@PostMapping(path = "/saveBook")
	public BookModel addBook(@RequestBody BookModel book) {
		repo.save(book);
		return book;
	}
	
	@PostMapping(path = "/editBook")
	public BookModel editBook(@RequestParam("bookId") int bookId,@RequestBody BookModel book) {
		BookModel book1 = repo.findById(bookId).orElse(new BookModel());
		repo.delete(book1);
		book.setBookId(bookId);
		repo.save(book);
		return book;
	}
	
	@PostMapping(path = "/deleteBook")
	public String deleteBook(@RequestParam("bookId") int bookId) {
		repo.deleteById(bookId);
		return "Deleted Successfully";
	}
	
	@GetMapping(path = "/getBooks") 
	public List<BookModel> getBooks() {
		return repo.findAll();
	}
	
	@PostMapping(path = "/getByType")
	public List<BookModel> editBook(@RequestParam("id") String genre) {
		return repo.findAllByGenre(genre);
	}
}
