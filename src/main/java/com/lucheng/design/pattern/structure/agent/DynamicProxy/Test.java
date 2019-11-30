package com.lucheng.design.pattern.structure.agent.DynamicProxy;

import com.lucheng.design.pattern.structure.agent.IOrderService;
import com.lucheng.design.pattern.structure.agent.Order;
import com.lucheng.design.pattern.structure.agent.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService iOrderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        iOrderService.saveOrder(order);
    }
}
