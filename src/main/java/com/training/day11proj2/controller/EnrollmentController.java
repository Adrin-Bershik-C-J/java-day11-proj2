package com.training.day11proj2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Enrollment> getAllEnrollments() {
        return enrollmentServiceInterface.getAllEnrollments();
    }

    @GetMapping("/student/{studentId}")
    public List<Enrollment> getCoursesByStudent(@PathVariable Long studentId) {
        return enrollmentServiceInterface.getCoursesByStudentId(studentId);
    }

}
