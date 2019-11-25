package com.lucheng.design.pattern.behavior.listener;

import java.util.Observable;
import java.util.Observer;

/**
 * 借助java支持的接口完成观察者模式
 */
public class Course extends Observable {
    private String courseName;

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"上发表了一个问题");
        setChanged();//改变状态
        notifyObservers(question);
    }
    //向队列中添加观察者
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
