package com.training.day11proj2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.training.day11proj2.dto.EnrollmentDTO;
import com.training.day11proj2.entity.Enrollment;
import com.training.day11proj2.service.EnrollmentServiceInterface;

@RequestMapping("/api/enroll")
@RestController
public class EnrollmentController {

    @Autowired
    private EnrollmentServiceInterface enrollmentServiceInterface;

    @PostMapping
    public Enrollment enroll(@RequestBody Enrollment enrollment) {
        return enrollmentServiceInterface.enroll(enrollment);
    }

    @GetMapping
    public List<EnrollmentDTO> getAllEnrollments() {
        return enrollmentServiceInterface.getAllEnrollmentsDTO();
    }

    @GetMapping("/student/{studentId}")
    public List<EnrollmentDTO> getCoursesByStudent(@PathVariable Long studentId) {
        return enrollmentServiceInterface.getCoursesByStudentId(studentId);
    }

}
