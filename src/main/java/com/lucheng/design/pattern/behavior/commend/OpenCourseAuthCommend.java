package com.lucheng.design.pattern.behavior.commend;

/**
 * 类似于实现了runnable接口的实现类
 */
public class OpenCourseAuthCommend implements Commend {
    private Course course;

    public OpenCourseAuthCommend(Course course) {
        this.course = course;
    }

    @Override
    public void execute() {
        course.open();
    }
}
