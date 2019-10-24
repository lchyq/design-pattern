package com.lucheng.design.pattern.creational.factorymethod;

public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("生产java课程");
    }
}
