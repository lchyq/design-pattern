package com.lucheng.design.pattern.behavior.Status;

public class Test {
    public static void main(String[] args) {
        CourseVideoStatusContext courseVideoStatusContext = new CourseVideoStatusContext();
        courseVideoStatusContext.setCourseVideoStatus(new PlayStatus());

        courseVideoStatusContext.play();

        System.out.println("现在的状态是："+courseVideoStatusContext.getCourseVideoStatus().getClass().getSimpleName());

        courseVideoStatusContext.speed();
        System.out.println("现在的状态是："+courseVideoStatusContext.getCourseVideoStatus().getClass().getSimpleName());

        courseVideoStatusContext.pause();
        System.out.println("现在的状态是："+courseVideoStatusContext.getCourseVideoStatus().getClass().getSimpleName());

        courseVideoStatusContext.speed();
    }
}
