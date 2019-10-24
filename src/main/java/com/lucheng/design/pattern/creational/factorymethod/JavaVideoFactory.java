package com.lucheng.design.pattern.creational.factorymethod;

public class JavaVideoFactory implements VideoFactory {
    @Override
    public Video produc3() {
        return new JavaVideo();
    }
}
