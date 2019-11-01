package com.lucheng.design.pattern.creational.singerlon;

/**
 * 双重检索单例模式
 * 利用 volatile 关键字禁止指令重排序
 */
public class DoubleCheckSingelon {
    private static volatile DoubleCheckSingelon doubleCheckSingelon = null;
    private DoubleCheckSingelon(){}
    public static DoubleCheckSingelon getInstance(){
        if(doubleCheckSingelon == null){
            synchronized (DoubleCheckSingelon.class){
                if(doubleCheckSingelon == null){
                    //1.分配内存
                    //2.初始化对象
                    //3.doubleCheckSingelon 指向内存中的对象
                    //其中 2.3 在单线程的情况下是允许指令重排序的
                    //因此可以添加 volatile 关键字禁止掉重排序
                    doubleCheckSingelon = new DoubleCheckSingelon();
                }
            }
        }
        return doubleCheckSingelon;
    }
}
