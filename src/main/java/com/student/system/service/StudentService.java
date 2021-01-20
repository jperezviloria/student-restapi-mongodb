package com.student.system.service;

import com.student.system.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Optional<Student> getStudentById(String idStudent);

    String saveStudent(Student student);
}
