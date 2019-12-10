package com.lucheng.design.pattern.behavior.strategy;

public class ManJianPromoteStrategy implements PromoteStrategy {
    @Override
    public void doPromote() {
        System.out.println("这是满减销售策略");
    }
}
