package com.lucheng.design.pattern.creational.factorymethod;

public class PythonVideoFactory implements VideoFactory {
    @Override
    public Video produc3() {
        return new PythonVideo();
    }
}
