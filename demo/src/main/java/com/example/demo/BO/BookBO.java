package com.example.demo.BO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.DAO.BookDAO;
import com.example.demo.entity.Book;

@Component
public class BookBO {
	@Autowired
	BookDAO Dao;

	public void stack(Book b) {
		Dao.save(b);
	}

	public Book findById(long Id) {
		Optional<Book> b2 = Dao.findById(Id);
		return (b2.get());
	}

	public List<Book> findBook() {
		return Dao.findAll();
	}

	// to find by price
	public List<Book> findBookByprice(int price) {
		return Dao.findByprice(price);
	}

	public List<Book> findBookByedition(int edition) {
		return Dao.findByedition(edition);
	}

	public List<Book> findBookByname(String book) {
		return Dao.findByname(book);
	}

	public List<Book> findBookByauthorName(String book1) {
		return Dao.findByauthorName(book1);
	}
	/*
	 * @Autowired StudentsDAO sdao; public void save(Students s) { sdao.save(s); }
	 */

	/*
	 * //to update book public Book updateBook(Book book) { Book responsebook =
	 * null; Book lbook = new Book(); lbook.setId(book.getId());
	 * lbook.setName(book.getName()); lbook.setAuthorName(book.getAuthorName());
	 * lbook.setPrice(book.getPrice()); lbook.setEdition(book.getEdition());
	 * Dao.save(lbook); return responsebook; }
	 */

}
