package com.student.system.controller;


import com.student.system.model.Student;
import com.student.system.service.implementation.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student-3")
public class StudentController {

    @Autowired
    StudentServiceImplementation studentServiceImplementation;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentServiceImplementation.getAllStudents();
    }

    @GetMapping("/{idStudent}")
    public Optional<Student> getStudentById(@PathVariable String idStudent){
        return studentServiceImplementation.getStudentById(idStudent);
    }

    @PostMapping
    public String saveStudent(@RequestBody Student student){
        return studentServiceImplementation.saveStudent(student);
    }

}
