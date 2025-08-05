package com.training.day11proj2.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.training.day11proj2.dto.CourseDTO;
import com.training.day11proj2.entity.Course;

public interface CourseServiceInterface {

    public Course createCourse(Course course);

    public Optional<Course> updateCourseDetails(Long id, Course course);

    public ResponseEntity<Optional<Course>> deleteCourse(Long id);

    CourseDTO getCourseDTOById(Long id);

}
