package com.lucheng.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂实现类
 * 与抽象方法的区别在于
 * 抽象工厂是产品族的集合
 * 而抽象方法只针对与特定的一种产品
 */
public abstract class CourseFactory {
    abstract Video getVideo();
    abstract Artical getArtical();
}
