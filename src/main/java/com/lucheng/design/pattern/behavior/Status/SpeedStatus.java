package com.lucheng.design.pattern.behavior.Status;

public class SpeedStatus extends CourseVideoStatus {
    @Override
    public void play() {
        super.context.setCourseVideoStatus(CourseVideoStatusContext.PLAY_STATUS);
        context.play();
    }

    @Override
    public void speed() {
        System.out.println("课程快进播放--");
    }

    @Override
    public void pause() {
        super.context.setCourseVideoStatus(CourseVideoStatusContext.PAUSE_STATUS);
        context.pause();
    }
}
