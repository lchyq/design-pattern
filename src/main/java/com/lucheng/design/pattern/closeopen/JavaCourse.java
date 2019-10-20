package com.lucheng.design.pattern.closeopen;
/**
 * 扮演的角色为 项目基础类 是偏底层的类
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
