package com.student.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	
	@PostMapping("/std/")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student);
		
	}
	
	@PutMapping("/std/")
	public Student updateStudent(@RequestBody Student student) {
		
		return studentService.updateStudent(student);
	}
	
	
	
	@GetMapping("/std/{id}")
	public Student findById(@PathVariable("id") Long id) {
		Student student =  studentService.findById(id);
		return student;
	}
	
	
	
	@GetMapping("/std/")
	public List<Student> findAllStudents(){
		List<Student> studentList = studentService.findAll();
		
		return studentList;
	}
	
	@DeleteMapping("/std")
	public void deleteUser(@PathVariable("id") Long id) {
		Student student = studentService.findById(id);
		studentService.deleteStudent(student);
	}
//	echo "# mydiary_project" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/jogarao10/mydiary_project.git
//	git push -u origin main
	
	

}
