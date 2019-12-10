package com.lucheng.design.pattern.behavior.commend;

/**
 * 命令模式
 * 一般结合备忘录模式使用
 * 此处没有使用
 * 将命令的执行与命令的定义隔离开，便于扩展
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java设计模式");

        OpenCourseAuthCommend open = new OpenCourseAuthCommend(course);
        CloseCourseAuthCommend close = new CloseCourseAuthCommend(course);

        Staff staff = new Staff();
        staff.addCommend(open);
        staff.addCommend(close);

        staff.executeCommend();
    }
}
