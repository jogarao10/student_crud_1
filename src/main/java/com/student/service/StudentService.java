package com.student.service;

import java.util.List;


import com.student.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(Student student);
	public Student findById(Long id);
	public List<Student> findAll();

}
