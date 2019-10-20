package com.lucheng.design.pattern.depandencyinverse;

/**
 * 依赖倒置原则
 *
 * 高层模块不应该依赖于底层模块
 * 二者都应该依赖于抽象
 *
 * 面向接口编程，而不是面向实现编程
 */
public class Lucheng {

//    public void studyJavaCourse(){
//        System.out.println("Lucheng 学习 java课程");
//    }

//    public void studyPythonCourse(){
//        System.out.println("Lucheng 学习 Python课程");
//    }

    //此时若还需要学习前端课程 那么此实现就需要修改
    //属于面向实现编程 因为 Lucheng 这个类 本身就是一种实现

    //高层模块应该依赖于抽象，因此 注入抽象类 ICourse
    private ICourse iCourse;
    public void setiCourse(ICourse iCourse){
        this.iCourse = iCourse;
    }
    //此时需要学习的课程依赖于 应用层面
    public void studyCourse(){
        iCourse.studyCourse();
    }
}
