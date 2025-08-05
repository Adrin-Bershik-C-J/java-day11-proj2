package com.training.day11proj2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.day11proj2.dto.StudentDTO;
import com.training.day11proj2.entity.Student;
import com.training.day11proj2.service.StudentServiceInterface;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    
    @Autowired
    private StudentServiceInterface studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Optional<Student> updateStudentDetails(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudentDetails(id, student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Student>> deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentDTOById(@PathVariable Long id) {
        return studentService.getStudentDTOById(id);
    }

}
