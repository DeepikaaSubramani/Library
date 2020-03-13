package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BO.BookBO;
import com.example.demo.BO.StudentsBO;
import com.example.demo.entity.Book;
import com.example.demo.entity.Students;

@RestController
public class StudentsController {

	/*
	 * private static final String template="Hello,%s!" ; private static AtomicLong
	 * counter=new AtomicLong();
	 */

	@Autowired
	StudentsBO stu;
	@Autowired
	BookBO boo;

	@PostMapping("/students")
	public String createStudents(@RequestBody Students stud) {

		System.out.println(stud.getBook());
		Students s1 = new Students();
		Book bookResponse = boo.findById(11);
		System.out.println("Book Response -->" + bookResponse);
		s1.setStudentId(stud.getStudentId());
		s1.setName(stud.getName());
		s1.setBook(bookResponse);
		stu.addstu(s1);
		return "the student has been added";
	}

	@GetMapping("/fetchStudentsBystudentId")
	public Students fetchStudents(@RequestParam Long studentId) {
		System.out.println("Name:" + studentId);
		Students s2 = stu.findBystudentId(studentId);
		return s2;
	}

	@GetMapping("/fetchStudentbyStudentName")
	public List<Students> getStudentByname(@RequestParam String name1) {
		List<Students> s3 = stu.findStudentsByName(name1);
		return s3;
	}

}
