package com.training.day11proj2.service;

import java.util.List;

import com.training.day11proj2.entity.Enrollment;

public interface EnrollmentServiceInterface {

    public Enrollment enroll(Enrollment enrollment);

    public List<Enrollment> getAllEnrollments();

    List<Enrollment> getCoursesByStudentId(Long studentId);

}
