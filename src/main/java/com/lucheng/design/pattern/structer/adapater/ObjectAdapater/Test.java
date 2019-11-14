package com.lucheng.design.pattern.structer.adapater.ObjectAdapater;

/**
 * 对象适配器模式
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapater();
        target.request();
    }
}
