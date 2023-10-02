package com.springbootlearn.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1, "Red rising", "Pierce Brown"),
            new Course(2, "Lord of the rings", "Tolkin"),
            new Course(3, "Learn AWS", "Wesley Purr"),
            new Course(4, "Vegan handroll", "Yoloshima"),
            new Course(5, "Spring boot and Spring cloud", "in28minutes"),
            new Course(6, "Music theory", "Staf Kchivorsky")
        );
    }
}
