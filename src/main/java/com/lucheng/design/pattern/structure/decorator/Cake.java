package com.lucheng.design.pattern.structure.decorator;
/**
 * 实体被装饰者
 * 先实现核心功能，附加功能由装饰者提供
 */
public class Cake extends  ACake{
    @Override
    public String desc() {
        return "蛋糕";
    }

    @Override
    public int cost() {
        return 8;
    }
}
