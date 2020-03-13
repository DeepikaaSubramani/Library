package com.example.demo.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BO.BookBO;
import com.example.demo.BO.StudentsBO;
import com.example.demo.entity.Book;
import com.example.demo.entity.Students;

@RestController
public class BookController {

	@Autowired
	BookBO bookBO;
	@Autowired
	StudentsBO stu;

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	@RequestMapping("/book")
	public Book book(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("book controller");
		return new Book();
	}

	@PostMapping("/book") // it is used for post the data using url
	public Book createBook(@RequestBody Book book) {
		logger.info("DATA-->" + book);
		bookBO.stack(book);
		logger.info("DATA-->" + book);
		return book;
	}

	@GetMapping("/book") // it is used for fetch the data using url public
	List<Book> fetchBooks() {
		List<Book> b = bookBO.findBook();
		return b;
	}

	@GetMapping(value = "/fetchBookById")
	public Book fetchBooks(@RequestParam Long Id) {
		System.out.println("Value:" + Id);
		Book b1 = bookBO.findById(Id);

		return b1;
	}

	@GetMapping("/fetchbyBookName")
	public List<Book> getBookByname(@RequestParam String name) {
		List<Book> b2 = bookBO.findBookByname(name);
		return b2;
	}

	@GetMapping("/fetchBookbyAuthorName")
	public List<Book> getBookByauthorName(@RequestParam String authorName) {
		List<Book> b3 = bookBO.findBookByauthorName(authorName);
		return b3;
	}

	@GetMapping("/fetchBookByPrice")
	public List<Book> getBookByprice(@RequestParam int price) {
		List<Book> b4 = bookBO.findBookByprice(price);
		return b4;
	}

	@GetMapping("/fetchBookByEdition")
	public List<Book> getBookByedition(@RequestParam int edition) {
		List<Book> b4 = bookBO.findBookByedition(edition);
		return b4;
	}

}
