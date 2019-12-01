package com.lucheng.design.pattern.behavior.listener;

/**
 * 观察者模式
 */
public class Test {
    public static void main(String[] args) {
        Question question1 = new Question("张三","java是什么");
        Question question2 = new Question("里斯","java设计模式这门课怎么样");

        Teacher teacher = new Teacher();
        teacher.setTeacherName("java_张老师");

        Course javaCourse = new Course();
        javaCourse.setCourseName("java设计模式");
        javaCourse.addObserver(teacher);

        javaCourse.produceQuestion(javaCourse,question1);
        javaCourse.produceQuestion(javaCourse,question2);
    }
}
