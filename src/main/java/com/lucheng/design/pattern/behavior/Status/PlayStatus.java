package com.lucheng.design.pattern.behavior.Status;

public class PlayStatus extends CourseVideoStatus {
    @Override
    public void play() {
        System.out.println("课程正常播放--");
    }

    @Override
    public void speed() {
        super.context.setCourseVideoStatus(CourseVideoStatusContext.SPEED_STATUS);
    }

    @Override
    public void pause() {
        super.context.setCourseVideoStatus(CourseVideoStatusContext.PAUSE_STATUS);
    }
}
