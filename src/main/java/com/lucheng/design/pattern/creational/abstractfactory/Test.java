package com.lucheng.design.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Artical artical = courseFactory.getArtical();
        video.produce();
        artical.produce();
    }
}
