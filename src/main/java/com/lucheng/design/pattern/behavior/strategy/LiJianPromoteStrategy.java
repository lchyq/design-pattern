package com.lucheng.design.pattern.behavior.strategy;

public class LiJianPromoteStrategy implements PromoteStrategy {
    @Override
    public void doPromote() {
        System.out.println("这是立减销售策略");
    }
}
