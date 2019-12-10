package com.lucheng.design.pattern.behavior.Status;

/**
 * 课程状态上下文
 * 用来状态之间的切换
 */
public class CourseVideoStatusContext {
    //用来记录课程视频状态
    private CourseVideoStatus courseVideoStatus;
    //上下文中有这三种状态，用于状态之间的切换
    protected static final PlayStatus PLAY_STATUS = new PlayStatus();
    protected static final SpeedStatus SPEED_STATUS = new SpeedStatus();
    protected static final PauseStatus PAUSE_STATUS = new PauseStatus();

    public CourseVideoStatus getCourseVideoStatus() {
        return courseVideoStatus;
    }

    public void setCourseVideoStatus(CourseVideoStatus courseVideoStatus) {
        this.courseVideoStatus = courseVideoStatus;
        this.courseVideoStatus.setContext(this);
    }

    public void play(){
        this.courseVideoStatus.play();
    }
    public void speed(){
        this.courseVideoStatus.speed();
    }
    public void pause(){
        this.courseVideoStatus.pause();
    }
}
