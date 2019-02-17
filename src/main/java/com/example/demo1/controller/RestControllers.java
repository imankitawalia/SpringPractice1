package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {


    @RequestMapping("/course")
    public Course getEndPoint(@RequestParam(value = "name", defaultValue = "Spring Boot Course",required = false) String name,
                              @RequestParam(value = "chapterCount", defaultValue = "3",required = false)int chapterCount){
        return new Course(name,chapterCount);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody Course course){
      return "Your course name : "+course.getName()+ " with chapter count : "+course.getChapterCount()+" is saved.";
    }

    //To pick up default values from properties file
    @Value("${default.course.name}")
    private String cName;
    @Value("${default.course.chapterCount}")
    private int cChapterCount;
    @RequestMapping("/defaultCourse")
    public Course getDefaultEndPoint(@RequestParam(value = "name",defaultValue = "Spring Boot Course",required = false) String name,
                              @RequestParam(value = "chapterCount", defaultValue = "3",required = false)int chapterCount){
        return new Course(cName,cChapterCount);
    }
}
