package com.lucheng.design.pattern.creational.simplefactory;

import com.lucheng.design.pattern.creational.simplefactory.Video;

public class PythonVedio extends Video {
    @Override
    public void produce() {
        System.out.println("python 课程");
    }
}
