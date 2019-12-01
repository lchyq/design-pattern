package com.lucheng.design.pattern.behavior.templateMethod;

/**
 * 前端课程属于一个大范围
 * 因此可以将钩子方法的权限开放至应用层来决定
 */
public class FECourse extends ACourse {
    private boolean needMakeArticle;
    @Override
    void packageCourse() {
        System.out.println("提供前端素材");
        System.out.println("提供前端代码");
    }

    public FECourse(boolean needMakeArticle) {
        this.needMakeArticle = needMakeArticle;
    }

    @Override
    public boolean needMakeArticle() {
        return this.needMakeArticle;
    }
}
