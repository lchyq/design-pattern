package com.lucheng.design.pattern.depandencyinverse;

/**
 * test属于应用层面的实例
 */
public class Test {
    public static void main(String[] args) {
        Lucheng lucheng = new Lucheng();
//        lucheng.studyJavaCourse();
//        lucheng.studyPythonCourse();

        lucheng.setiCourse(new JavaCourse());
        lucheng.studyCourse();
        lucheng.setiCourse(new PythonCourse());
        lucheng.studyCourse();
    }
}
