package com.training.day11proj2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.day11proj2.dto.EnrollmentDTO;
import com.training.day11proj2.entity.Enrollment;
import com.training.day11proj2.repository.EnrollmentRepository;

@Service
public class EnrollmentServiceInterfaceImplementation implements EnrollmentServiceInterface {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public Enrollment enroll(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public List<EnrollmentDTO> getAllEnrollmentsDTO() {
        return enrollmentRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public List<EnrollmentDTO> getCoursesByStudentId(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId).stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private EnrollmentDTO mapToDTO(Enrollment e) {
        return new EnrollmentDTO(
                e.getEnrollmentId(),
                e.getStudent().getStudentId(),
                e.getStudent().getName(),
                e.getStudent().getEmail(),
                e.getCourse().getCourseId(),
                e.getCourse().getTitle(),
                e.getCourse().getDescription());
    }
    
}
