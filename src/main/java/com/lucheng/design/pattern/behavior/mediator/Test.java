package com.lucheng.design.pattern.behavior.mediator;

/**
 * 中介者模式
 */
public class Test {
    public static void main(String[] args) {
        User lc = new User("lc");
        User tom = new User("tom");
        //lc 与 tom之间的对话交给中介者来协调处理
        lc.sendMessage("tom 让我们来学习设计模式吧");
        tom.sendMessage("ok lc，祝学习愉快");
    }
}
