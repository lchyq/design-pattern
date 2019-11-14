package com.lucheng.design.apttern.structer.flyweight;

/**
 * 管理者
 * 需要作报告
 */
public class Manager implements Employee {
//    两个属性都是外部状态
//    都是通过外部赋值获得的值
    private String department;
    private String content;
    public Manager(String department){
        this.department = department;
    }
    @Override
    public void makePaper() {
        System.out.println(content);
    }

    public void setContent(String content) {
        this.content = content;
    }
}
