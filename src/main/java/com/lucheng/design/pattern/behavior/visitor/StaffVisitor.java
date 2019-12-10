package com.lucheng.design.pattern.behavior.visitor;

/**
 * 员工visitor
 * 此处将visitor 分层次 不同的visitor的权限不同
 */
public class StaffVisitor implements Visitor {
    //模拟数据访问工作
    //此处应该做的是，访问数据，处理数据
    @Override
    public void visit(Course course) {
        if(course instanceof FreeCourse){
            System.out.println(String.format("这是免费课程，课程名称为：%S",course.getName()));
        }else if(course instanceof CodingCourse){
            System.out.println(String.format("这是实战课程，课程名称为：%S，课程价格为：%S",course.getName(),((CodingCourse) course).getPrice()));
        }
    }
}
