package com.lucheng.design.pattern.behavior.mediator;

/**
 * 中介者模式中的协调者
 * showMessage 就是用来协调user的一个方法
 */
public class StudyGroup {
    public static void showMessage(User user,String message){
        System.out.println(String.format("%s说：%s",user.getName(),message));
    }
}
