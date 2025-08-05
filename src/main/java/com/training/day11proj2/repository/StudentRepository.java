package com.training.day11proj2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.day11proj2.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
