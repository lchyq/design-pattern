package com.lucheng.design.pattern.behavior.strategy;

/**
 * 基本的策略模式就是
 * 抽象一系列的策略，通过组合的形式来决定使用哪种策略
 * 但是基本的策略避免不了if-else的情况
 * 需要结合工厂模式+享元模式来避免繁多的情况
 */
public class Test {
    public static void main(String[] args) {
        //基本的策略模式避免不了if-else
        PromoteActivity promoteActivity = new PromoteActivity(new ManJianPromoteStrategy());
        PromoteActivity lijian = new PromoteActivity(new LiJianPromoteStrategy());
        //可以结合工厂模式+享元模式来避免
    }
}
