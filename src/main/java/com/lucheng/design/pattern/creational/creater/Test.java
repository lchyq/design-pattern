package com.lucheng.design.pattern.creational.creater;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("javaCourse").buildvideo("javaVideo").buildarticle("javaArticle").buildprice("20").build();
        System.out.println(course);
    }
}
