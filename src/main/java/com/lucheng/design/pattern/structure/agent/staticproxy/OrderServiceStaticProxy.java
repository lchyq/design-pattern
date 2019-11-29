package com.lucheng.design.pattern.structure.agent.staticproxy;

import com.lucheng.design.pattern.structure.agent.IOrderService;
import com.lucheng.design.pattern.structure.agent.Order;
import com.lucheng.design.pattern.structure.agent.OrderServiceImpl;
import com.lucheng.design.pattern.structure.agent.springdatasourceproxy.DbSourceContextHolder;

/**
 * orderService的静态代理类
 */
public class OrderServiceStaticProxy {
    //目标增强对象
    private IOrderService iOrderService;
    //目标增强方法 建议与目标增强对象中的增强方法同名
    public int saveOrder(Order order){
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int dbRouter = order.getUserId() % 2;
        System.out.println(String.format("数据以分配到目标数据库：db_%s",dbRouter));
        //设置dbSource
        DbSourceContextHolder.setDbType(String.format("db_%s",String.valueOf(dbRouter)));
        afterMethod();
        return iOrderService.saveOrder(order);
    }
    public void beforeMethod(){
        System.out.println("before method code");
    }
    public void afterMethod(){
        System.out.println("after method code");
    }
}
