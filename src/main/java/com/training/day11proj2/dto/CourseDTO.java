package com.training.day11proj2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CourseDTO {

    private Long courseId;
    private String title;
    private String description;

}
