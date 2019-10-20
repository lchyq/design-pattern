package com.lucheng.design.pattern.closeopen;

/**
 * 实践java中的开闭原则
 * 对扩展开放，对修改关闭
 * 接口扮演的角色是偏向稳定的，接口中的内容不会轻易被修改，增加，删除等
 */
public interface ICourse {
    Integer getId();
    String getName();
    double getPrice();
}
