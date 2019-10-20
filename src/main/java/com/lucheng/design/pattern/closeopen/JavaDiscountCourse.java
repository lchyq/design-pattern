package com.lucheng.design.pattern.closeopen;

/**
 * 此时，若我们需要修改一些内容
 * 比如获取此课程的折扣价格
 * 应在原有的功能基础上进行修改
 * 比如新增方法，而不是去修改方法
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }
    //获取折扣价格,假如我们打8折
    @Override
    public double getPrice(){
        return super.getPrice() * 0.8;
    }
    //获取原价
    public double getOrignPrice(){
        return super.getPrice();
    }
}
