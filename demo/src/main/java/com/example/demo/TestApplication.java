package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.BO.BookBO;
import com.example.demo.entity.Book;
import com.example.demo.entity.Students;

@SpringBootApplication
@EnableJpaAuditing
public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(TestApplication.class, args);
		 //BookBO b = context.getBean(BookBO.class); 

		// b.config();
		// b.bookDetails();

		/*
		 * //to create a table Book b1 = new Book(); b1.setName("c++");
		 * b1.setAuthorName("Balaguruswamy"); b1.setPrice(750); b1.setEdition(8);
		 * b.stack(b1);
		 */

		
		/*
		 * //to find by id Book b3 = b.findById(3); System.out.println("data>>" + b3);
		 */
		 

		/*
		 * //to find all System.out.println(b.findBook());
		 */

		/*
		 * //to find by price System.out.println("Price : "+b.findBookByPrice(550));
		 */

		/*
		 * //to update by id Book b4 = b.findById(2);
		 * b4.setName("Financial Accounting"); b4.setAuthorName("T.S.Reddy");
		 * b4.setPrice(10); b4.setEdition(8); b.updateBook(b4);
		 */

		
		  // it is used for createdat updateat 
		//BookBO bookBO =context.getBean(BookBO.class);
		 

		/*
		 * Book b5=new Book(); b5.setName("Python"); b5.setAuthorName("David Rones");
		 * b5.setPrice(200); b5.setEdition(4); bookBO.stack(b5);
		 */

		
		/*  // creating book 
		Book b6 = new Book(); 
		b6.setName("Spring");
		b6.setAuthorName("Felipe Gutierrez"); 
		b6.setPrice(800); 
		b6.setEdition(5); 
		bookBO.stack(b6);
		  
		  // creating Students1 
		//Book book=context.getBean(Book.class); 
		Students s = new Students();
		  
		  s.setName("vg");// Associating Students to Book 
		  s.setBook(b6); // creating Students2 
		  Students s1 = new Students(); 
		  s1.setName("deepi");// Associating Students to Book 
		  s1.setBook(b6);
		  
		  // Associating Book with Students
		  
		  List<Students> students = new ArrayList<Students>(); 
		  students.add(s);
		  students.add(s1); 
		  b6.setStudents(students);
		  
		  System.out.println("Adding Book*******"); 
		  bookBO.stack(b6);
		 
	*/
	}
}
