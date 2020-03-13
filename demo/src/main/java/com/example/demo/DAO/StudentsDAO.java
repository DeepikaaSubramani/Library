package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Students;

@Repository
public interface StudentsDAO extends JpaRepository<Students, Long> {
	@Query("select s from Students s where s.Name LIKE  %:Name%")
	List<Students> findByName(@Param("Name") String Name);
}
