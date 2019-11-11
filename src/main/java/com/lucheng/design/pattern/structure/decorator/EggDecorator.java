package com.lucheng.design.pattern.structure.decorator;

/**
 * 实体装饰者
 */
public class EggDecorator extends ADecorator {
    protected EggDecorator(ACake aCake) {
        super(aCake);
    }

    @Override
    public String desc() {
       return super.desc() + "加鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }
}
