package com.lucheng.design.pattern.behavior.chain;

/**
 * 责任链模式核心处理接口
 */
public abstract class Handler {
    protected Handler handler;
    //设置下一个责任链
    public void setNextHandler(Handler handler){
        this.handler = handler;
    }
    //责任链的职责是为了处理课程发布，因此子类责任链
    //来负责扩展此方法
    public abstract void handle(Article article);
}
