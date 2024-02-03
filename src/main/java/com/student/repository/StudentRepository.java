package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
	
}
