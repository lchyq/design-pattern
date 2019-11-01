package com.lucheng.design.pattern.creational.singerlon;

import java.sql.SQLOutput;

/**
 * 基于静态内部类的单例模式
 * 类在被初始化时，jvm会锁住该过程
 * 因此时线程安全的
 */
public class StaticSingelon {
    private StaticSingelon(){}
    private static class innerClass{
        private static StaticSingelon staticSingelon = new StaticSingelon();
    }
    public static StaticSingelon getInstance(){
        return innerClass.staticSingelon;
    }
}
