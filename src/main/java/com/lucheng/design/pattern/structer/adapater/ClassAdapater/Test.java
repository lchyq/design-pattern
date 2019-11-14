package com.lucheng.design.pattern.structer.adapater.ClassAdapater;

public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
