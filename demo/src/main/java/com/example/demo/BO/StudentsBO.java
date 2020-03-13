package com.example.demo.BO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.DAO.StudentsDAO;
import com.example.demo.entity.Book;
import com.example.demo.entity.Students;

@Component
public class StudentsBO {

	@Autowired
	StudentsDAO Dao;

	public void addstu(Students s) {
		Dao.save(s);
	}

	public List<Students> findStudents() {
		return Dao.findAll();
	}

	public Students findBystudentId(long Id) {
		Optional<Students> b2 = Dao.findById(Id);
		return (b2.get());
	}

	public List<Students> findStudentsByName(String student) {
		return Dao.findByName(student);
	}

}
