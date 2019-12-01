package com.lucheng.design.pattern.structure.agent;

import com.lucheng.design.pattern.structure.agent.staticproxy.OrderServiceStaticProxy;

/**
 * 代理模式
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        proxy.saveOrder(order);
    }
}
