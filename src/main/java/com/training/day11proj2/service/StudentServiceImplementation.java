package com.training.day11proj2.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.training.day11proj2.dto.StudentDTO;
import com.training.day11proj2.entity.Student;
import com.training.day11proj2.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentServiceInterface {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> updateStudentDetails(Long id, Student student) {
        return studentRepository.findById(id).map(oldStudent -> {
            oldStudent.setName(student.getName());
            oldStudent.setEmail(student.getEmail());
            return studentRepository.save(oldStudent);
        });
    }

    @Override
    public ResponseEntity<Optional<Student>> deleteStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public StudentDTO getStudentDTOById(Long id) {
        Student s = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return new StudentDTO(s.getStudentId(), s.getName(), s.getEmail());
    }
    
}
