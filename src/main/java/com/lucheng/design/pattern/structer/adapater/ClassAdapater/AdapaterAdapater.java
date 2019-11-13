package com.lucheng.design.pattern.structer.adapater.ClassAdapater;

/**
 * 适配者
 * 通过实现target接口来适配继承的被适配者
 */
public class AdapaterAdapater extends Adapatee implements Target {
    @Override
    public void request() {
        //可增加相关的适配逻辑
        System.out.println("适配相关逻辑前");
        super.AdataperRequest();
        System.out.println("适配相关逻辑后");
        //可增加相关的适配逻辑
    }
}
