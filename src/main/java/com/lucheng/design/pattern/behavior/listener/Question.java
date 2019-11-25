package com.lucheng.design.pattern.behavior.listener;

public class Question {
    private String questionName;
    private String userName;

    public Question(){}
    public Question(String userName,String questionName){
        this.questionName = questionName;
        this.userName = userName;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
