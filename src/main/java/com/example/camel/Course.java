package com.example.camel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private Long id;

    private String title;

    private String description;

    private List<Long> projectIds;

    private List<Long> appliedProjectIds;

    private Set<Long> mcqQuizIDs;

    private List<Long> LessonIds;

    private CourseType courseType = CourseType.BETA;

}

