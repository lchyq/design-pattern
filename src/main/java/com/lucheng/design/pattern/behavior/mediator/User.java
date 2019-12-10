package com.lucheng.design.pattern.behavior.mediator;

/**
 * 用户类
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        StudyGroup.showMessage(this,message);
    }
}
