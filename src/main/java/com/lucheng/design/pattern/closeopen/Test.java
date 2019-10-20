package com.lucheng.design.pattern.closeopen;

public class Test {
    public static void main(String[] args) {
        //父类引用指向子类实例 ，但是父类中仅仅只有父类拥有的属性与方法
        //无法接触到子类新增的属性与方法
        ICourse iCourse = new JavaDiscountCourse(1,"java课程 ",348);
        //因为iCourse 指向的是 JavaDiscountCourse 实例，所以可以强转
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程id:"+javaDiscountCourse.getId()+" 课程名称:"+javaDiscountCourse.getName()+" 课程价格:"+javaDiscountCourse.getPrice());
        System.out.println("课程原价："+javaDiscountCourse.getOrignPrice());
    }
}
