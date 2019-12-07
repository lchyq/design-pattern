package com.lucheng.design.pattern.behavior.commend;
/**
 * 类似于实现了runnable接口的实现类
 */
public class CloseCourseAuthCommend implements Commend {
    private Course course;

    public CloseCourseAuthCommend(Course course) {
        this.course = course;
    }

    @Override
    public void execute() {
        course.close();
    }
}
