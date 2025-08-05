package com.training.day11proj2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public List<Enrollment> getCoursesByStudentId(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId);
    }

}
