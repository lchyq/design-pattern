package com.lucheng.design.pattern.behavior.listener;

import java.util.Observable;
import java.util.Observer;

/**
 * 借助java支持的接口完成观察者模式
 */
public class Teacher implements Observer {
    private String teacherName;
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName+"收到了"+question.getUserName()+"在"+course.getCourseName()+"课程上提的问题----"+question.getQuestionName()+"问题");
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
