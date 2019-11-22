package com.lucheng.design.pattern.structure.component;

/**
 * 组合模式
 * 可以使得客户端对单个对象与组合对象的处理方式一致
 * 缺点：对象类型多时，会使的逻辑便的复杂
 */
public class Test {
    public static void main(String[] args) {
        CatelogComponent mainCourseCatelog = new CourseCatelog("课程主目录",1);
        CatelogComponent javaCourseCtelog = new CourseCatelog("java目录",2);

        CatelogComponent java1 = new Course("java技术卷1",12,3);
        CatelogComponent java2 = new Course("java技术卷2",20,3);
        CatelogComponent java3 = new Course("java技术卷3",20,2);
        javaCourseCtelog.add(java1);
        javaCourseCtelog.add(java2);

        mainCourseCatelog.add(javaCourseCtelog);
        mainCourseCatelog.add(java3);

        mainCourseCatelog.print();
    }
}
