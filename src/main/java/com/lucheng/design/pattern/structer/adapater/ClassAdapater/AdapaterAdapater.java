package com.lucheng.design.pattern.structer.adapater.ClassAdapater;

/**
 * 适配者
 * 通过实现target接口来适配继承的被适配者
 */
public class AdapaterAdapater extends Adapatee implements Target {
    @Override
    public void request() {
        //可增加相关的适配逻辑
        super.AdataperRequest();
        //可增加相关的适配逻辑
    }
}
