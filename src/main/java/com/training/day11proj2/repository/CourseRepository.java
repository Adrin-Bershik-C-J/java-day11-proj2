package com.training.day11proj2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.day11proj2.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
