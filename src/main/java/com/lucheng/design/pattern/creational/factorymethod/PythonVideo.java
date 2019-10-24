package com.lucheng.design.pattern.creational.factorymethod;

public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("生产python课程");
    }
}
