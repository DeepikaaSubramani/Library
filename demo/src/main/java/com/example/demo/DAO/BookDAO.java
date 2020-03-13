package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

@Repository
public interface BookDAO extends JpaRepository<Book, Long> {
	/*
	 * public void stack() { System.out.println("Books has been Added"); }
	 */

	@Query("select b from Book b where b.price=:price")
	List<Book> findByprice(@Param("price") int price);

	@Query("select b from Book b where b.name LIKE  %:name%")
	List<Book> findByname(@Param("name") String name);

	@Query("select b from Book b where b.authorName LIKE  %:authorName%")
	List<Book> findByauthorName(@Param("authorName") String authorName);

	@Query("select b from Book b where b.edition=:edition")
	List<Book> findByedition(@Param("edition") int edition);
}
