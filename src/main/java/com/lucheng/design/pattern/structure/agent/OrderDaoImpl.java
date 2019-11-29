package com.lucheng.design.pattern.structure.agent;

public class OrderDaoImpl implements OrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("dao层插入成功");
        return 1;
    }
}
