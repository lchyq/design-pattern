package com.lucheng.design.apttern.structer.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理者工厂类
 * 享元模式模式都是结合工厂模式使用
 * 一般实现为容器单例模式
 */
public class ManagerFactory {
    private static final Map<String,Employee> EMPLOYEE_FLYWEIGHT = new HashMap<>();
    public Manager getManager(String department){
        if(department == null){
            return null;
        }
        Manager manager = (Manager) EMPLOYEE_FLYWEIGHT.get(department);
        if(manager == null){
            System.out.println("开始创建部门"+department);
            manager = new Manager(department);
            manager.setContent(department+"部门Leader："+"开始作报告");
            EMPLOYEE_FLYWEIGHT.put(department,manager);
        }
        return manager;

    }
}
