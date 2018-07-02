package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student getStudentByName(String name) {
		return studentRepository.findByName(name);
	}

}
