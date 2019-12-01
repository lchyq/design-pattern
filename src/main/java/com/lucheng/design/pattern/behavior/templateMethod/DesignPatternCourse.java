package com.lucheng.design.pattern.behavior.templateMethod;

/**
 * 设计模式属于后端课程中的一部分
 * 可以自定钩子方法的权限
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供java源代码");
    }
    @Override
    public boolean needMakeArticle() {
        return false;
    }
}
