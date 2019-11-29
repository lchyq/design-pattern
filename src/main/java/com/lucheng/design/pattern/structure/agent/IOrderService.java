package com.lucheng.design.pattern.structure.agent;

/**
 * service层
 */
public interface IOrderService {
    /**
     * 返回生效行数
     * @param order
     * @return
     */
    int saveOrder(Order order);
}
