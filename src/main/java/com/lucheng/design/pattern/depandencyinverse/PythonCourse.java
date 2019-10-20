package com.lucheng.design.pattern.depandencyinverse;

/**
 * 依赖于抽象 ICourse
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Lucheng 学习 Python课程");
    }
}
