package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(); 
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null); 
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student); 
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id); 
    }
}