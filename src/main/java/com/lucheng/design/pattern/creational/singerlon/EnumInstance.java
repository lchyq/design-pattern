package com.lucheng.design.pattern.creational.singerlon;

/**
 * 通过枚举创建单例模式
 */
public enum  EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
