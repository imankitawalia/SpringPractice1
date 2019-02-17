package com.example.demo1.controller;

public class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    private int chapterCount;

    public Course(String name, int chapterCount) {
        this.name = name;
        this.chapterCount = chapterCount;
    }
}
