package com.training.day11proj2.service;

import java.util.List;

import com.training.day11proj2.dto.EnrollmentDTO;
import com.training.day11proj2.entity.Enrollment;

public interface EnrollmentServiceInterface {

    public Enrollment enroll(Enrollment enrollment);

    List<EnrollmentDTO> getAllEnrollmentsDTO();

    List<EnrollmentDTO> getCoursesByStudentId(Long studentId);

}
