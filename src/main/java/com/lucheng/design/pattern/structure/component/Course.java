package com.lucheng.design.pattern.structure.component;

import static java.lang.System.out;

/**
 * 课程
 */
public class Course extends CatelogComponent{
    private String name;
    private Integer price;
    public Course (String name,Integer price,Integer level){
        this.name = name;
        this.price = price;
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void getContent() {
        for(int i = 0; i < level;i++){
            out.print(" ");
        }
        System.out.println("name:"+name+" price:"+price);
    }

    @Override
    public void print() {
        System.out.println("name:"+name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
