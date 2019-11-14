package com.lucheng.design.pattern.structer.adapater.ClassAdapater;

/**
 * 适配器目标
 * 相关输出需要依赖该request方法输出
 * 该target可以有多种实现方式
 */
public interface Target {
    void request();
}
