package com.lucheng.design.pattern.behavior.commend;

public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void open(){
        System.out.println(String.format("打开%S的课程权限",courseName));
    }

    public void close(){
        System.out.println(String.format("关闭%S的课程权限",courseName));
    }
}
