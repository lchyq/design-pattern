package com.lucheng.design.pattern.creational.singerlon;

import java.io.Serializable;

/**
 * 饿汉式-单例模式
 * 利用的是实例化类时jvm会锁住该类
 * 因此是线程安全的
 * 最简单的单例模式
 *
 * 对于饿汉式的单例模式，可以对其构造函数进行改造
 * 来避免反射攻击
 */
public class HungreySingelon implements Serializable,Cloneable {
    private static final HungreySingelon HUNGREY_SINGELON = new HungreySingelon();
    private HungreySingelon(){
        if(HUNGREY_SINGELON != null){
            throw new RuntimeException("单例模式，禁止反射攻击创建实例");
        }
    }
    public static HungreySingelon getInstance(){
        return HUNGREY_SINGELON;
    }
    //通过该方法来防止反射破坏单例模式
    private Object readResolve(){
        return HUNGREY_SINGELON;
    }

    //此时的单例模式，是会被克隆方式破坏的
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //这样就不会被克隆破坏了
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
