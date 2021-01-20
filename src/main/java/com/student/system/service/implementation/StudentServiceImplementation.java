package com.student.system.service.implementation;

import com.student.system.model.Student;
import com.student.system.repository.StudentRepository;
import com.student.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(String idStudent) {
        return studentRepository.findById(idStudent);
    }

    @Override
    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "Student was saved with other message";
    }
}
