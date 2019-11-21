package com.vastika.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.studentmanagement.model.Student;
import com.vastika.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	public void saveStudentInfo(Student student) {
		studentRepository.save(student);			
	}

	@Override
	public void updateStudentInfo(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudentInfo(int id) {
		studentRepository.deleteById(id);;
	}

	@Override
	public Optional<Student> getStudentInfo(int id) {
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> getAllStudentInfo() {
		return (List<Student>) studentRepository.findAll();
	}

}
