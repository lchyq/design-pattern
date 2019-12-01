package com.lucheng.design.pattern.structure.decorator;

/**
 * 装饰者模式
 */
public class Test {
    public static void main(String[] args) {
        ACake aCake = new Cake();
        aCake = new EggDecorator(aCake);
        aCake = new EggDecorator(aCake);
        System.out.println(aCake.desc());
        System.out.println(aCake.cost());
    }
}
