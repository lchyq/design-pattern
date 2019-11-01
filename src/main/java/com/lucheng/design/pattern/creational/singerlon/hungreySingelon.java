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
public class hungreySingelon implements Serializable {
    private static final hungreySingelon HUNGREY_SINGELON = new hungreySingelon();
    private hungreySingelon(){
        if(HUNGREY_SINGELON != null){
            throw new RuntimeException("单例模式，禁止反射攻击创建实例");
        }
    }
    public static hungreySingelon getInstance(){
        return HUNGREY_SINGELON;
    }
    //通过该方法来防止反射破坏单例模式
    private Object readResolve(){
        return HUNGREY_SINGELON;
    }
}
