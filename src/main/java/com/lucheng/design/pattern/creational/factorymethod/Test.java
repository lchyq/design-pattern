package com.lucheng.design.pattern.creational.factorymethod;

/**
 * 工厂方法模式
 * 将创建实例的实现延迟到子类中来实现
 * 解耦原先的实现
 *
 * 缺点：会造成工厂类过多，代码难以理解的现象
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.produc3();
        video.produce();

        videoFactory = new PythonVideoFactory();
        video = videoFactory.produc3();
        video.produce();
    }
}
