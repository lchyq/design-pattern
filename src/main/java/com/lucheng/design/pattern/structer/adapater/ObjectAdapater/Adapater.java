package com.lucheng.design.pattern.structer.adapater.ObjectAdapater;

/**
 * 对象适配器，只实现target方法
 */
public class Adapater implements Target {
    private Adapatee adapatee = new Adapatee();
    @Override
    public void request() {
        System.out.println("被适配者方法前！");
        adapatee.request();
        System.out.println("被适配者方法后");
    }
}
