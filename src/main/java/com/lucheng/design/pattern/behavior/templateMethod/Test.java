package com.lucheng.design.pattern.behavior.templateMethod;

/**
 * 模板方法模式
 * 抽象出固定流程
 * 抽象出固定步骤
 * 将需要扩展的步骤留给子类来实现
 */
public class Test {
    public static void main(String[] args) {
        ACourse aCourse = new DesignPatternCourse();
        aCourse.makeCourse();

        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
    }
}
