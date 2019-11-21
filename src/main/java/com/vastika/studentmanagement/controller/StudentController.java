package com.vastika.studentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vastika.studentmanagement.model.Student;
import com.vastika.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		 this.studentService = studentService;
	}
	@PostMapping
	public void saveStudentInfo(@RequestBody Student student) {
		studentService.saveStudentInfo(student);
	}
	@PutMapping
	public void updateStudentInfo(@RequestBody Student student) {
		studentService.saveStudentInfo(student);
	}
	@DeleteMapping("/{id}")
	public void deleteStudentInfo(@PathVariable int id) {
		studentService.deleteStudentInfo(id);
	}
	
	@GetMapping("/{id}")
	 public Optional<Student> getStudentInfoById(@PathVariable int id) {
		return studentService.getStudentInfo(id);
	}
	
	@GetMapping
	 public List<Student> getALLStudentInfo() {
		return studentService.getAllStudentInfo();
	}
	

}