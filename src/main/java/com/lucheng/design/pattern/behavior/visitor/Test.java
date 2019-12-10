package com.lucheng.design.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 * 访问者模式定义了操作数据的逻辑
 * 核心就是将操作数据的一些事交给访问者来完成
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();

        CodingCourse coding = new CodingCourse("实战课程");
        coding.setPrice(383);
        FreeCourse free = new FreeCourse("免费课程");

        courses.add(coding);
        courses.add(free);
        for(Course course : courses){
            //此处可以扩展多个 visitor
            //以便 对数据进行不同层次的 处理
            course.accept(new StaffVisitor());
        }
    }
}

