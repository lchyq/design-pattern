package com.lucheng.design.pattern.structure.agent.DynamicProxy;

import com.lucheng.design.pattern.structure.agent.Order;
import com.lucheng.design.pattern.structure.agent.springdatasourceproxy.DbSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {
    /**
     * 目标增强对象
     */
    private Object targetObject;
    public OrderServiceDynamicProxy(Object targetObject){
            this.targetObject = targetObject;
    }

    public Object bind(){
        Class clz = targetObject.getClass();
        return Proxy.newProxyInstance(clz.getClassLoader(),clz.getInterfaces(),this);
    }

    /**
     *
     * @param proxy 目标增强对象
     * @param method 目标增强方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(args[0]);
        Object o = method.invoke(targetObject,args);
        afterMethod();
        return o;
    }
    public void beforeMethod(Object obj){
        System.out.println("beforeMethod code");
        if(obj instanceof Order){
            Order order = (Order) obj;
            int index = order.getUserId();
            int db_router = index % 2;
            DbSourceContextHolder.setDbType(String.format("db_%s",db_router));
            System.out.println(String.format("分配到目标数据源，db_%s",db_router));
        }
    }
    public void afterMethod(){
        System.out.println("afterMethod code");
    }
}
