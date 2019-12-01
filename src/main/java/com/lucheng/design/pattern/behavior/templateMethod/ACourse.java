package com.lucheng.design.pattern.behavior.templateMethod;

/**
 * 模板方法模式
 * 1.抽象出固定的模式
 * 2.将需要扩展的功能交给子类去实现
 * ACourse是一个制作课程的模板类
 */
public abstract class ACourse {
    //定义固定流程
    protected final void makeCourse(){
        this.makePpt();
        this.makeVideo();
        if(needMakeArticle()){
            this.makeArticle();
        }
        this.packageCourse();
    }
    //定义固定步骤
    private void makePpt(){
        System.out.println("制作ppt");
    }
    private void makeVideo(){
        System.out.println("制作视频");
    }
    //对于手记这个固定方法，有的子类是不需要的
    //因此 定钩子方法供子类选择是否使用该方法
    private void makeArticle(){
        System.out.println("制作手记");
    }
    //钩子方法
    public boolean needMakeArticle(){
        return true;
    }
    //需要向子类开放方法
    abstract void packageCourse();
}
