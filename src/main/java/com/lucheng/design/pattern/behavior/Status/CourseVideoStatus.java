package com.lucheng.design.pattern.behavior.Status;

/**
 * 抽象课程状态类
 */
public abstract class CourseVideoStatus {
    protected CourseVideoStatusContext context;

    public CourseVideoStatusContext getContext() {
        return context;
    }

    public void setContext(CourseVideoStatusContext context) {
        this.context = context;
    }

    //视频的三个状态交给子类来扩展
    public abstract void play();
    public abstract void speed();
    public abstract void pause();
}
