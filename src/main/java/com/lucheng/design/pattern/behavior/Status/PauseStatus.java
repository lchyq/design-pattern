package com.lucheng.design.pattern.behavior.Status;

public class PauseStatus extends CourseVideoStatus {
    @Override
    public void play() {
        super.context.setCourseVideoStatus(CourseVideoStatusContext.PLAY_STATUS);
    }

    @Override
    public void speed() {
        System.out.println("暂停状态不能快进！");
    }

    @Override
    public void pause() {
        System.out.println("课程停止状态");
    }
}
