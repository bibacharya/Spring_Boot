package com.vastika.studentmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.vastika.studentmanagement.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
