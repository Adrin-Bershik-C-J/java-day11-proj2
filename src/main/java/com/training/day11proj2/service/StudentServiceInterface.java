package com.training.day11proj2.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.day11proj2.dto.StudentDTO;
import com.training.day11proj2.entity.Student;

public interface StudentServiceInterface {

    public Student createStudent(Student student);

    public Optional<Student> updateStudentDetails(Long id, Student student);

    public ResponseEntity<Optional<Student>> deleteStudent(@PathVariable Long id);

    StudentDTO getStudentDTOById(Long id);

}
