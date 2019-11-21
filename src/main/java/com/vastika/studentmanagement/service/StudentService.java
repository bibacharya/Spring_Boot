package com.vastika.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.vastika.studentmanagement.model.Student;

public interface StudentService {
	void saveStudentInfo(Student student);
	void updateStudentInfo(Student student);
	void deleteStudentInfo(int id);
	
	Optional<Student> getStudentInfo(int id);
	List<Student> getAllStudentInfo();

}
