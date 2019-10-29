package com.lucheng.design.pattern.creational.abstractfactory;

public class JavaCourseFactory extends CourseFactory {
    @Override
    Video getVideo() {
        return new JavaVideo();
    }

    @Override
    Artical getArtical() {
        return new JavaArtical();
    }
}
