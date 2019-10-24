package com.lucheng.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        //这种实现方式，在跨包时，会引入其他的包
//        Video video = new JavaVedio();
//        video.produce();

        //使用简单工厂修复该问题
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.produce("java");
//        video.produce();

        //利用反射 来避免 不符合开闭原则
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.produce(JavaVedio.class);
        video.produce();
    }
}
