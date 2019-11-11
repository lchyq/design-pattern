package com.lucheng.design.pattern.structure.decorator;

/**
 * 抽象装饰者
 * 抽象装饰者，实体被装饰者都是ACake的子类
 * 可以通过组合来实现功能的附加
 */
public abstract class ADecorator extends ACake{
    private ACake aCake;
    protected ADecorator(ACake aCake){
        this.aCake = aCake;
    }
    @Override
    public String desc() {
        return aCake.desc();
    }

    @Override
    public int cost() {
        return aCake.cost();
    }
}
